package core;

/**
 *  class Transactions: транзакция подразумевает любую операцию с банковским
 *				счетом: ввод (поступление денежных средств),
 *				вывод (снятие со счета денежных средств либо закрытие
 *				счета), банковский перевод на свой счет в этом банке,
 * 				на свой счет в другом банке, перевод третьему лицу,
 *				оплата каких-либо видов услуг: коммунальные платежи,
 *				мобильные платежи и т.д.)
 *
 *	У каждой транзакции есть номер (id), дата совершения транзакции (date),
 *	клиент банка (Client), есть название банка (bankName), номер счета
 *	(BankAccount), валюта счета Currency, адрес клиента (Address), вид операции
 *	со счетом (ввод/вывод/перевод),
 *
 */

import java.text.SimpleDateFormat;


public class Transactions {

    private int id;     // номер транзакции

    public void addFunds(long sum){     // ввод денежной суммы на счет


    }

    public void withdrawFunds(long sum){     // снятие со счета денежной суммы



    }

    public void transfer(long sum){         // перевод денежной суммы



    }




    static SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    Client client = new Client();






}
