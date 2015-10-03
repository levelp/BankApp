package core;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest extends Assert {

    /**
     * Типичный сценарий
     */
    @Test
    public void testClient() {

        Client client = new Client();

        BankAccount account = new BankAccount();
        client.accounts.add(account);

        Transaction transaction = new Transaction();
        client.transactions.add(transaction);


        String s1, s2;

        s1 = "Петров";
        client.setSurname(s1);
        s2 = client.getSurname();
        assertEquals(s1, s2);

        s1 = "Петр";
        client.setName(s1);
        s2 = client.getName();
        assertEquals(s1, s2);

        s1 = "Петрович";
        client.setMiddlename(s1);
        s2 = client.getMiddlename();
        assertEquals(s1, s2);

        s1 = "Петров Петр Петрович";
        assertEquals(s1, client.fullName());


        s1 = "Санкт-Петербург";
        client.address.setCity(s1);
        s2 = client.address.getCity();
        assertEquals(s1, s2);

        s1 = "Лиговский проспект";
        client.address.setStreet(s1);
        s2 = client.address.getStreet();
        assertEquals(s1, s2);

        s1 = "50";
        client.address.setHouse(s1);
        s2 = client.address.getHouse();
        assertEquals(s1, s2);

        s1 = "17";
        client.address.setApt(s1);
        s2 = client.address.getApt();
        assertEquals(s1, s2);

        int k1, k2;
        k1 = 194210;
        client.address.setIndex(k1);
        k2 = client.address.getIndex();
        assertEquals(k1, k2);


        k1 = 1001;
        account.setId(k1);
        k2 = account.getId();
        assertEquals(k1, k2);

        long l1, l2;
        l1 = 371283;
        account.setAmount(l1);
        l2 = account.getAmount();
        assertEquals(l1, l2);

        s1 = "ALFABANK";
        account.setBankName(s1);
        s2 = account.getBankName();
        assertEquals(s1, s2);

    }


}



