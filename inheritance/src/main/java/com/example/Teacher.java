package com.example;

public class Teacher extends Person{
    String subject;

    public Teacher() {
        //TODO Auto-generated constructor stub
    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    void teach() {
        System.out.println("I teach " + subject);
    }

    @Override
    void greet() {
        super.greet();
        System.out.println("I am a teacher with subject " + subject);
    }
    
}
