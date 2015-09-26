package core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Валюта
 */
@Entity
public class Currency {

    /**
     * Валюта по-умолчанию
     */
    public static final Currency USD = new Currency();

    private String id;
    /**
     * Сокращение валюты: "руб."
     */
    private String name;

    /**
     * @return Трёхбуквенный код Валюты
     */
    @Id
    @Column(length = 3)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
