package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "empData")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "address")
    private String city;

    public Student() {
    }

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // getters & setters (Hibernate safe)
    public int getId() {
        return id;
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
}

