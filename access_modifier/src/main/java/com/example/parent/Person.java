package com.example.parent;

public class Person {
    public String name;
    public String address;

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
    
}
