package core;

import javax.persistence.*;

/**
 * Любой авторизованный пользователь системы
 */
@Entity
@Table(name = "\"user\"")
public class User {
    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue
    private int id;

    /**
     * Логин в системе
     */
    @Column(name = "login")
    private String login;

    /**
     * Фамилия
     */
    @Column
    private String surname;

    /**
     * Имя
     */
    @Column
    private String name;

    /**
     * Отчество
     */
    @Column
    private String middleName;

    /**
     * @return Полное имя
     */
    public String fullName() {
        return surname + " " + name + " " + middleName;
    }


    public int getId() {
        return id;
    }

    public void setId(int idUser) {
        id = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String loginUser) {
        login = loginUser;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surnameUser) {
        surname = surnameUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameUser) {
        name = nameUser;
    }

    public String getMiddlename() {
        return middleName;
    }

    public void setMiddlename(String middlenameUser) {
        middleName = middlenameUser;
    }


}
