package com.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ade", "Jakarta");
        Teacher teacher1 = new Teacher("Budi", "Medan", "Math");
        Doctor doctor1 = new Doctor("Cahya", "Semarang", "Heart");
        Programmer programmer1 = new Programmer("Dian", "Lembang", "Java");

        person1.greet();
        System.out.println();
        teacher1.greet();
        System.out.println();
        doctor1.greet();
        System.out.println();
        programmer1.greet();

    }
}