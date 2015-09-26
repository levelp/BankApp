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
        client.name = "Иван";
        client.middleName = "Иванович";
        client.surname = "Иванов";
        assertEquals("Иванов Иван Иванович", client.fullName());
        client.address.city = "Санкт-Петербург";
        client.address.street = "Невский проспект";
        client.address.house = "12Б";
        client.address.apt = "5А";
        client.address.index = 194000;
    }

}
