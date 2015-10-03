package core;


import javax.persistence.*;

/**
 * Банковский счёт
 */
@Entity
@Table(name = "bank_account")
public class BankAccount {
    /**
     * Идентификатор счёта
     */
    @Id
    @GeneratedValue
    private int id;

    /**
     * Сумма на счёте в минимальных единицах
     */
    @Column
    private long amount;

    /**
     * Валюта
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Currency currency = Currency.USD;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Client client;

    @Column
    private String bankName;    // название банка

    public BankAccount() {
    }

    public BankAccount(Currency currency) {
        this.currency = currency;
    }


    public int getId() {
        return id;
    }

    public void setId(int idBankAccount) {
        id = idBankAccount;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amountBankAccount) {
        amount = amountBankAccount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bNameBankAccount) {
        bankName = bNameBankAccount;
    }


    public void creditAccount(long creditAmount) {   // пополнить счет

//        Transaction transaction = new Transaction(...);

//        amount += creditAmount;

    }

    public void debitAccount(long debitAmount) {     // списать со счета

//        Transaction transaction = new Transaction();

//        amount -= debitAmount;


    }

    public void openAccount() {     // открыть счет

/*

        setId(100);

        setAmount(0);

        setBankName("ALFABANK");

        creditAccount(0);

*/

    }

    public void closeAccount() {    // закрыть счет


    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Currency getCurrency() {
        return currency;
    }
}
