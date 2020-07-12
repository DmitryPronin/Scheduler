package model;

public class User {
    int id;
    String name;
    String surname;
    String email;
    String phonenumber;
    String position;


    public User(int id, String name, String surname, String email, String phonenumber, String position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.position = position;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
