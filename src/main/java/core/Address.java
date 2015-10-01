package core;

/**
 * Адрес клиента/сотрудника
 */
public class Address {
    /**
     * Город
     */
    private String city;
    /**
     * Улица
     */
    private String street;
    /**
     * Дом
     */
    private String house;
    /**
     * Квартира
     */
    private String apt;
    /**
     * Почтовый индекс
     */
    private int index;


    public String getCity() {
        return city;
    }

    public void setCity(String cityAddress) {
        city = cityAddress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String streetAddress) {
        street = streetAddress;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String houseAddress) {
        house = houseAddress;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String aptAddress) {
        apt = aptAddress;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int indexAddress) {
        index = indexAddress;
    }

}
