package core;

/**
 *
 * AddressTest.
 */


import org.junit.Assert;
import org.junit.Test;


public class AddressTest extends Assert{


    @Test
    public void testAddress() {

        Address address = new Address();

        String buff1, buff2;

        buff1 = "Saint Petersburg";
        address.setCity(buff1);
        buff2 = address.getCity();
        assertEquals(buff1 , buff2);

        buff1 = "Marata";
        address.setStreet(buff1);
        buff2 = address.getStreet();
        assertEquals(buff1, buff2);

        buff1 = "10";
        address.setHouse(buff1);
        buff2 = address.getHouse();
        assertEquals(buff1, buff2);

        buff1 = "25";
        address.setApt(buff1);
        buff2 = address.getApt();
        assertEquals(buff1, buff2);

        int k1, k2;

        k1 = 190100;
        address.setIndex(k1);
        k2 = address.getIndex();
        assertEquals(k1, k2);


    }



}
