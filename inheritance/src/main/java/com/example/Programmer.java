package com.example;

public class Programmer extends Person {
    String technologi;

    public Programmer() {
        //TODO Auto-generated constructor stub
    }

    public Programmer(String name, String address, String technologi) {
        super(name, address);
        this.technologi = technologi;
    }

    void hacking() {
        System.out.println("I hack with website ");
    }

    void coding() {
        System.out.println("I code with " + technologi);
    }

    @Override
    void greet() {
        super.greet();
        System.out.println("I am a programmer with technologi " + technologi);
    }
}
