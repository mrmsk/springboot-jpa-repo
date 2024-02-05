package com.mk.jpa.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String city;
    private String status;

    public int getId() {
        return id;
    }

    public User() {


    }

    public void setId(int id) {
        this.id = id;
    }

    public User(int id, String name, String city, String status) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
