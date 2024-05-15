package com.example.parent;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public Person() {
        super();
    }

    public void greet() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I live at " + address);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
}
