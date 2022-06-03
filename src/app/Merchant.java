package app;

// Модель объекта Продавца.
public class Merchant {

    private final String name;
    private final String phone;
    private final String surname;

    public Merchant(String name,String surname , String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;

    }

    public String getName() {
        return name;
    }

    public String getSurname() { return surname; }

    public String getPhone() {
        return phone;
    }


}
