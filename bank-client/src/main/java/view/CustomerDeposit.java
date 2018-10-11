package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerDeposit {

	private JFrame frame;
	private String accountNo;
	private JTextField tf_accountNum;
	private JTextField tf_moneyAmounts;

	/**
	 * Launch the application.
	 */
	public void run() {
		try {
			this.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * Create the application.
	 */
	public CustomerDeposit(String accountNo) {
		initialize();
		this.accountNo = accountNo;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Account number: ");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(41, 42, 178, 43);
		frame.getContentPane().add(label);
		
		tf_accountNum = new JTextField();
		tf_accountNum.setText(accountNo);
		tf_accountNum.setEditable(false);
		tf_accountNum.setColumns(10);
		tf_accountNum.setBounds(207, 50, 178, 35);
		frame.getContentPane().add(tf_accountNum);
		
		JLabel label_1 = new JLabel("Money Amounts: ");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(41, 103, 156, 43);
		frame.getContentPane().add(label_1);
		
		tf_moneyAmounts = new JTextField();
		tf_moneyAmounts.setColumns(10);
		tf_moneyAmounts.setBounds(207, 111, 178, 35);
		frame.getContentPane().add(tf_moneyAmounts);
		
		JButton btn_deposit = new JButton("Deposit");
		btn_deposit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_deposit.setBounds(157, 202, 170, 57);
		frame.getContentPane().add(btn_deposit);
		
		JButton btn_back = new JButton("Back");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new CustomerWindow(accountNo).run();
			}
		});
		btn_back.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_back.setBounds(157, 289, 170, 57);
		frame.getContentPane().add(btn_back);
	}
}