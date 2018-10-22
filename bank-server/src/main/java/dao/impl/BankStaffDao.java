package dao.impl;

import dao.IBankStaffDao;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtils;

public class BankStaffDao implements IBankStaffDao {
    private static BankStaffDao instance = null;
    Session session = HibernateUtils.getSessionFactory().openSession();

    public static BankStaffDao getInstance() {
        if (instance == null) {
            return new BankStaffDao();
        }
        return instance;
    }

    public Long selectTheBiggestId() {
        try {
            session.getTransaction().begin();
            Query query = session.createQuery("select id from BankStaffEntity order by id desc ");

            Long id = (Long) query.setMaxResults(1).uniqueResult();

            session.getTransaction().commit();
            return id;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }
    }
}