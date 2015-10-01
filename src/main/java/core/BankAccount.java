package core;


/**
 * Банковский счёт
 */
public class BankAccount {
    /**
     * Идентификатор счёта
     */
    private int id;

    /**
     * Сумма на счёте в минимальных единицах
     */
    private long amount;

    /**
     * Валюта
     */
    private Currency currency = Currency.USD;

    private String bankName;    // название банка


    public int getId(){
        return id;
    }

    public void setId(int idBankAccount){
        id = idBankAccount;
    }

    public long getAmount(){
        return amount;
    }

    public void setAmount(long amountBankAccount){
        amount = amountBankAccount;
    }

    public String getBankName(){
        return bankName;
    }

    public void setBankName(String bNameBankAccount){ bankName = bNameBankAccount; }


    public void creditAccount(long creditAmount){   // пополнить счет

//        Transactions transaction = new Transactions(...);

//        amount += creditAmount;

    }

    public void debitAccount(long debitAmount){     // списать со счета

//        Transactions transaction = new Transactions();

//        amount -= debitAmount;


    }

    public void openAccount(){     // открыть счет

/*

        setId(100);

        setAmount(0);

        setBankName("ALFABANK");

        creditAccount(0);

*/

    }

    public void closeAccount(){    // закрыть счет


    }


}
