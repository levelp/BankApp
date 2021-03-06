package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.Serializable;
import java.util.List;

public class DAO<T, Id extends Serializable> {
    private static Session currentSession;

    private static Transaction currentTransaction;

    public Session openCurrentSession() {
        currentSession = HibernateUtil.getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionWithTransaction() {
        currentSession = HibernateUtil.getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
        currentSession = null;
    }

    public void closeCurrentSessionWithTransaction() {
        currentTransaction.commit();
        currentTransaction = null;
        currentSession.close();
        currentSession = null;
    }

    public Session getCurrentSession() {
        if (currentSession == null)
            currentSession = openCurrentSessionWithTransaction();
        return currentSession;
    }

    public void persist(T entity) {
        getCurrentSession().save(entity);
    }

    public void update(T entity) {
        getCurrentSession().update(entity);
    }

    public T findById(Id id) {
        throw new NotImplementedException();
    }

    public void delete(T entity) {
        getCurrentSession().delete(entity);
    }

    public List<T> findAll() {
        throw new NotImplementedException();
    }

    public void deleteAll() {
        findAll().forEach(this::delete);
    }
}
