package core;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest extends Assert {
    @Test
    public void testBase() {
        Client client = new Client();
        BankAccount account = new BankAccount();
        client.accounts.add(account);
        account.id = 1001;
    }
}
