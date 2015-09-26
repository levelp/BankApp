package core;

import java.util.ArrayList;
import java.util.List;

/**
 * Клиент банка
 */
public class Client extends User {

    /**
     * Адрес
     */
    Address address = new Address();

    /**
     * Банковский счёт этого пользователя
     */
    List<BankAccount> accounts = new ArrayList<BankAccount>();
}
