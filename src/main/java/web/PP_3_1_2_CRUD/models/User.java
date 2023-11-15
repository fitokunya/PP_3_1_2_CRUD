package web.PP_3_1_2_CRUD.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @javax.persistence.Column(name = "name")
    @NotEmpty(message = "Please write your name")
    @Size(min = 3, max = 24, message = "Please write the name in size from 3 to 24 characters")
    private String name;

    @javax.persistence.Column(name = "lastname")
    @NotEmpty(message = "Please write your last name")
    @Size(min = 3, max = 24, message = "Please write the last name in size from 3 to 24 characters")
    private String lastname;

    @javax.persistence.Column(name = "age")
    @Min(value = 7, message = "Please specify the age of at least 7 years")
    private int age;

    @Column(name = "email")
    @NotEmpty(message = "Please write your EMail")
    @Email(message = "Please write EMail with format ***@***.**")
    private String email;

    public User() {
    }

    public User(String name, String lastname, int age, String email) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname=" + lastname +
                ", email='" + email + '\'' +
                '}';
    }
}
