package com.example.childs;
import com.example.parent.Person;

public class Programmer extends Person {
    public String technologi;

    public Programmer() {
        //TODO Auto-generated constructor stub
    }

    public Programmer(String name, String address, String technologi) {
        super(name, address);
        this.technologi = technologi;
    }

    public void hacking() {
        System.out.println("I hack with website ");
    }

    public void coding() {
        System.out.println("I code with " + technologi);
    }

    @Override
    public void greet() {
        super.greet();
        System.out.println("I am a programmer with technologi " + technologi);
    }
}
