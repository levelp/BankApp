package core;

import javax.persistence.*;

/**
 * Адрес клиента/сотрудника
 */
@Entity
@Table
public class Address {
    private int id;

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

    @Column(length = 100)
    public String getCity() {
        return city;
    }

    public void setCity(String cityAddress) {
        city = cityAddress;
    }

    @Column
    public String getStreet() {
        return street;
    }

    public void setStreet(String streetAddress) {
        street = streetAddress;
    }

    @Column
    public String getHouse() {
        return house;
    }

    public void setHouse(String houseAddress) {
        house = houseAddress;
    }

    @Column
    public String getApt() {
        return apt;
    }

    public void setApt(String aptAddress) {
        apt = aptAddress;
    }

    @Column
    public int getIndex() {
        return index;
    }

    public void setIndex(int indexAddress) {
        index = indexAddress;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
