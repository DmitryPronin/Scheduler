package model;

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String mobilephone;
    private String position;
    private String status;

    public User(int id, String name, String surname, String email, String mobilephone, String position, String status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.mobilephone = mobilephone;
        this.position = position;
        this.status = status;
    }

    public User(int id, String name, String surname, String email, String phonenumber, String position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.mobilephone = phonenumber;
        this.position = position;
    }

    public User(int id, String name, String surname, String email) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", mobilephone='" + mobilephone + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
