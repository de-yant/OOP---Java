package com.example.childs;
import com.example.parent.Person;

public class Teacher extends Person{
    private String subject;

    public Teacher() {
        //TODO Auto-generated constructor stub
    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    public void teach() {
        System.out.println("I teach " + subject);
    }

    @Override
    public void greet() {
        super.greet();
        System.out.println("I am a teacher with subject " + subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}
