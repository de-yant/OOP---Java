package com.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Programmer("Ade", "Jakarta", "Java");
        Person person2 = new Doctor("Eva", "Tasik", "Heart");
        Person person3 = new Teacher("Bela", "Bandung", "Math");

        sayHello(person1);
        System.out.println();
        sayHello(person2);
        System.out.println();
        sayHello(person3);
    }

    public static void sayHello(Person person) {
        String message = "";
        if (person instanceof Programmer) {
            Programmer programmer = (Programmer) person;
            message = "Hallo, " + programmer.name + ". I am a programmer with expertise in " + programmer.technologi + ".";
        } else if (person instanceof Doctor) {
            Doctor doctor = (Doctor) person;
            message = "Hello, " + doctor.name + ". I am a doctor with expertise in " + doctor.speciality + ".";
        } else if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            message = "Hello, " + teacher.name + ". I am a teacher with expertise in " + teacher.subject + ".";
        } else {
            System.out.println("I am a person");
        }
        System.out.println(message);
    }

}