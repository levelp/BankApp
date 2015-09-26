package core;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest extends Assert{

    @Test
    public void testBase() {

        Client client = new Client();

        BankAccount account = new BankAccount();

        Transaction tranaction = new Transaction();

        client.accounts.add(account);

        client.transactions.add(tranaction);

        int k1, k2;

        k1 = 1001;
        account.setId(k1);
        k2 = account.getId();
        assertEquals(k1, k2);

        long l1, l2;
        l1 = 371283;
        account.setAmount(l1);
        l2 = account.getAmount();
        assertEquals(l1, l2);

        String s1, s2;
        s1 = "ALFABANK";
        account.setBankName(s1);
        s2 = account.getBankName();
        assertEquals(s1, s2);

        s1 = "Saint Petersburg";
        client.address.setCity(s1);
        s2 = client.address.getCity();
        assertEquals(s1, s2);












    }


}
