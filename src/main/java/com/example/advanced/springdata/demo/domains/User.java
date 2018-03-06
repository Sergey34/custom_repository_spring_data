package com.example.advanced.springdata.demo.domains;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String pass;

    public User() {
    }

    public User(String firstName, String lastName, String pass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pass = pass;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
