package core;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Клиент банка
 */
@Entity
@Table
public class Client extends User {

    /**
     * Адрес
     */
    @ManyToOne
    Address address = new Address();

    /**
     * Банковский счёт этого пользователя
     */
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, mappedBy = "client")
    List<BankAccount> accounts = new ArrayList<BankAccount>();
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, mappedBy = "client")
    List<Transaction> transactions = new ArrayList<Transaction>();

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addTransaction(Transaction tr) {
        tr.setClient(this);
        transactions.add(tr);
    }

    public void addAccount(BankAccount account) {
        account.setClient(this);
        accounts.add(account);
    }
}
