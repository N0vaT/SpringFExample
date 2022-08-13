package com.nova.domain;


import javax.validation.constraints.*;

public class Person {

    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min=3, max=20, message = "Name should be between 3 amd 20 characters")
    private String name;
    @Min(value = 0, message = "Age should be greater then 0")
    @Max(value = 120, message = "Age should be less then 0")
    private int age;
    @NotEmpty(message = "Email should not be empty")
    @Size(max=30, message = "Email should be smaller 30 characters")
    @Email(message = "Email should be valid")
    private String email;

    public Person() {
    }

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
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
}
