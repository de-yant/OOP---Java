package com.example;

public class Person {
    String name;
    String address;

    public Person(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public Person() {
        super();
    }

    void greet() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I live at " + address);
    }
    
}
