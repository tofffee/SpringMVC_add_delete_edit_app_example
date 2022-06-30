package com.example.app.models;

public class Person {

    private long id;
    private String name;
    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
        this.id = 0;
        this.name = null;
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


}
