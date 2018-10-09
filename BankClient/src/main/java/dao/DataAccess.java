package dao;

import controller.Interceptor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class DataAccess {
    public static DataAccess dataAccess = null;
    private Session session;
    private SessionFactory factory;
    private String sqlQuery;

    private DataAccess() {
        factory = HibernateUtils.getSessionFactory();
        session = factory.withOptions().interceptor(new Interceptor()).openSession();
    }

    public static DataAccess getInstance() {
        if (dataAccess == null) {
            return new DataAccess();
        }
        return dataAccess;
    }

    public List Operations(String procedureName, Class obj, String[] params, Object[] values) {

        try {

            // All the action with DB via Hibernate
            // must be located in one transaction.
            // Start Transaction.
            session.getTransaction().begin();

            // Create an HQL statement, query the object.
            // Equivalent to the SQL statement:
            // Select e.* from module e
            // sqlQuery = sql;

            // Create Query object.
            String paramList = "";
            for (int i = 0; i < params.length; i++) {
                if (params.length <= 0) {
                    paramList = "()";
                    break;
                }
                if (i == params.length - 1) {
                    paramList += "?";
                    break;
                }
                paramList += "?,";
            }
            Query query = session.createNativeQuery("CALL " + procedureName + "(" + paramList + ")", obj);

            for (int j = 0; j < params.length; j++) {
                if (params.length <= 0) {
                    break;
                }
                query.setParameter(j + 1, values[j]);
            }

            // Execute query.
            List list = query.getResultList();

            // Commit data.
            session.getTransaction().commit();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        }
    }
	/*
	public List operationsForDeleteAndUpdate(String procedureName, Class obj, String[] params, Object[] values) {

		try {

			// All the action with DB via Hibernate
			// must be located in one transaction.
			// Start Transaction.
			session.getTransaction().begin();

			// Create Query object.
			String paramList = "";
			// format the stored procedure like CALL procedureName(?,?,?)
			for (int i = 0; i < params.length; i++) {
				if (params.length <= 0) {
					paramList = "()";
					break;
				}
				if (i == params.length - 1) {
					paramList += "?";
					break;
				}
				paramList += "?,";
			}
			Query query = session.createNativeQuery("CALL " + procedureName + "(" + paramList + ")", obj);

			for (int j = 0; j < params.length; j++) {
				if (params.length <= 0) {
					break;
				}
				query.setParameter(j + 1, values[j]);
			}

			// Execute query.
			query.executeUpdate();
			List list = query.getResultList();

			session.getTransaction().commit();
			return list;
			// return 1;
		} catch (Exception e) {
			e.printStackTrace();
			// Rollback in case of an error occurred.
			session.getTransaction().rollback();
			return null;
			// return -1;
		}
	}
	*/

}
