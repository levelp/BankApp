package dao;

import core.User;

import java.util.Collection;
import java.util.List;

// DAO - Data Access Object
public class UserDao<T> extends DAO<User, Integer> {
    public User findById(Integer id) {
        return (User) getCurrentSession().get(User.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<User> findAll() {
        return (List<User>) getCurrentSession().createQuery("from User").list();
    }

    public void deleteAllBulk() {
        getCurrentSession().createQuery("DELETE FROM User").executeUpdate();
    }

    public void deleteFromTo(Integer from, Integer to) {
        getCurrentSession().createQuery("DELETE FROM User " +
                "WHERE id >= :from AND id <= :to")
                .setParameter("from", from)
                .setParameter("to", to)
                .executeUpdate();
    }

    public void deleteById(Integer id) {
        getCurrentSession().createQuery("DELETE FROM User " +
                "WHERE id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }

    public void deleteCollection(Collection<Integer> list) {
        list.forEach(this::deleteById);
    }
}
