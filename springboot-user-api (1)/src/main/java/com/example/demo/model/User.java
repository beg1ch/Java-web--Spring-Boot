package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private Country country;

    public User() {}

    public User(String firstName, Integer age, Country country) {
        this.firstName = firstName;
        this.age = age;
        this.country = country;
    }

    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public Integer getAge() { return age; }
    public Country getCountry() { return country; }

    public void setId(Long id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setAge(Integer age) { this.age = age; }
    public void setCountry(Country country) { this.country = country; }
}