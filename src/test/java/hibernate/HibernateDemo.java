package hibernate;

import core.*;
import dao.DAO;
import dao.HibernateUtil;
import dao.UserDao;
import dao.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class HibernateDemo extends Assert {

    @Test
    public void testHibernate() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.close();
    }

    @Test
    public void testUserService() {
        UserService service = new UserService();
        User user1 = new User("Иванов", "Иван", "Иванович");
        User user2 = new User("Петров", "Пётр", "Петрович");
        User user3 = new User("Сидоров", "Сидор", "Сидорович");

        System.out.println("*** Добавление пользователей в БД ***");
        service.persist(user1);
        service.persist(user2);
        service.persist(user3);

        List<User> users1 = service.findAll();
        assertEquals("Теперь 3 пользователя в системе", 3, users1.size());

        System.out.println("Пользователи:");
        for (User u : users1) {
            System.out.println("* " + u);
        }

        System.out.println("*** Обновление пользователей в БД ***");
        user1.setSurname("Илья");
        service.update(user1);
        System.out.println("Обновлённый пользователь: => " + service.findById(user1.getId()).toString());

        System.out.println("*** Поиск по id ***");
        Integer id1 = user1.getId();
        User another = service.findById(id1);
        System.out.println("Пользователь с id " + id1 + " => " + another.toString());

        System.out.println("*** Удаление пользователя по id ***");
        Integer id3 = user3.getId();
        service.delete(id3);
        System.out.println("Удалили пользователя с id = " + id3 + ".");
        assertEquals("Осталось 2 пользователя", 2, service.findAll().size());

        System.out.println("Пользователи:");
        List<User> users2 = service.findAll();
        for (User u : users2) {
            System.out.println("* " + u);
        }

        System.out.println("*** Удаляем всех пользователей ***");
        service.deleteAll();

        assertEquals("Их не должно было остаться", 0, service.findAll().size());
    }


    @Test
    public void testClientService() {
        UserDao service = new UserDao();
        service.openCurrentSessionWithTransaction();

        User user1 = new User("Иванов", "Иван", "Иванович");
        User user2 = new User("Петров", "Пётр", "Петрович");
        User user3 = new User("Сидоров", "Сидор", "Сидорович");
        System.out.println("*** Добавление пользователей в БД ***");
        service.persist(user1);
        service.persist(user2);
        service.persist(user3);

        DAO<Address, Integer> addressDao = new DAO<Address, Integer>();
        Client client = new Client();
        Address address = new Address();
        address.setCity("111");
        address.setHouse("111");
        address.setIndex(194124);
        addressDao.persist(address);
        client.setAddress(address);
        service.persist(client);

        client.addTransaction(new Transaction());

        service.closeCurrentSessionWithTransaction();
    }

    /**
     * Работа со связанными таблицами:
     * - обращение к полю
     * - сложные запросы
     */
    @Test
    public void testComplexQuery() {
        UserDao userDao = new UserDao();
        userDao.openCurrentSessionWithTransaction();
        Session session = userDao.getCurrentSession();

        Currency currency = new Currency();
        currency.setId("RUR");
        currency.setName("руб.");
        session.save(currency);

        DAO<Address, Integer> addressDao = new DAO<Address, Integer>();
        Client client = new Client();
        Address address = new Address();
        address.setCity("111");
        address.setHouse("111");
        address.setIndex(194124);
        addressDao.persist(address);
        client.setAddress(address);

        BankAccount account = new BankAccount(currency);
        client.addAccount(account);

        session.save(client);

        int id = 82; //account.getId();
        System.out.println("id = " + id);

        BankAccount sameAccount = (BankAccount) session.get(BankAccount.class, id);
        System.out.println("sameAccount.getCurrency().getName() = " + sameAccount.getCurrency().getName());

        userDao.closeCurrentSessionWithTransaction();
    }

    /**
     *
     */
    @Test
    public void test() {
        UserDao userDao = new UserDao();
        userDao.openCurrentSessionWithTransaction();
        Session session = userDao.getCurrentSession();

        int id = 82; //account.getId();
        System.out.println("id = " + id);

        BankAccount sameAccount = (BankAccount) session.get(BankAccount.class, id);

        System.out.println("sameAccount.getId() = " + sameAccount.getId());
        System.out.println("До загрузки валюты");
        Currency currency = sameAccount.getCurrency();
        String name = currency.getName();
        System.out.println("После загрузки валюты");
        System.out.println("sameAccount.getCurrency().getName() = " + name);

        //session.createQuery("SELECT Currency c FROM Currency JOIN ON ")
        sameAccount.getClient();

        userDao.closeCurrentSessionWithTransaction();

    }
}
