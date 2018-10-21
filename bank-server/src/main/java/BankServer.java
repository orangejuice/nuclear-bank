import io.grpc.Server;
import io.grpc.ServerBuilder;
import rpc.impl.UserCustomerLoginImpl;

import java.io.IOException;
import java.util.logging.Logger;

import static Const.Server.SERVER_PORT;

public class BankServer {
    private static final Logger logger = Logger.getLogger(BankServer.class.getName());
    private Server server;

    public static void main(String[] args) {
//        System.out.println(PINGenerator.getInstance().generatePIN());
//        System.out.println(IBANGenerator.getInstance().generateIBAN(1000000000));
//        System.out.println(CardNumberGenerator.getInstance().getCardNumber());
//        System.out.println(OperationNoGenerator.getInstance().generateOperationNo());
        final BankServer server = new BankServer();
        try {
            server.start();
            server.blockUntilShutdown();
        } catch (Exception e) {
            e.printStackTrace();
            logger.severe(e.getLocalizedMessage());
        }

    }


    private void start() throws IOException {

        server = ServerBuilder.forPort(SERVER_PORT)
                .addService(new UserCustomerLoginImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + SERVER_PORT);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                BankServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}