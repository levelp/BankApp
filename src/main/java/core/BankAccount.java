package core;

/**
 * Банковский счёт
 */
public class BankAccount {
    /**
     * Идентификатор счёта
     */
    public int id;

    /**
     * Сумма на счёте в минимальных единицах
     */
    public long amount;

    /**
     * Валюта
     */
    public Currency currency = Currency.USD;
}
