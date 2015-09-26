package core;

/**
 * Любой авторизованный пользователь системы
 */
public class User {
    /**
     * Идентификатор
     */
    int id;

    /**
     * Логин в системе
     */
    String login;
    /**
     * Фамилия
     */
    String surname;
    /**
     * Имя
     */
    String name;
    /**
     * Отчество
     */
    String middleName;

    /**
     * @return Полное имя
     */
    public String fullName() {
        return surname + " " + name + " " + middleName;
    }
}
