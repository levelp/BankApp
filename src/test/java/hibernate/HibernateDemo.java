package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

public class HibernateDemo {

    @Test
    public void testHibernate() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //session.getTransaction().commit();
        session.close();
    }
}
