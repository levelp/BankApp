package core;

/**
 * Любой авторизованный пользователь системы
 */
public class User {
    /**
     * Идентификатор
     */
    private int id;

    /**
     * Логин в системе
     */
    private String login;
    /**
     * Фамилия
     */
    private String surname;
    /**
     * Имя
     */
    private String name;
    /**
     * Отчество
     */
    private String middleName;

    /**
     * @return Полное имя
     */
    public String fullName() {
        return surname + " " + name + " " + middleName;
    }


    public int getId(){
        return id;
    }

    public void setId(int idUser){
        id = idUser;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String loginUser){
        login = loginUser;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surnameUser){
        surname = surnameUser;
    }

    public String getName(){
        return name;
    }

    public void setName(String nameUser){
        name = nameUser;
    }

    public String getMiddlename(){ return middleName; }

    public void setMiddlename(String middlenameUser){
        middleName = middlenameUser;
    }


}
