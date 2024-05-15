package com.example;
import com.example.childs.Programmer;
import com.example.childs.Doctor;
import com.example.childs.Teacher;
import com.example.parent.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Ade");
        person1.setAddress("Jakarta");

        // Person person1 = new Programmer("Ade", "Jakarta", "Java");
        // Person person2 = new Doctor("Eva", "Tasik", "Heart");
        // Person person3 = new Teacher("Bela", "Bandung", "Math");

        System.out.println(person1.getName());
    }

    public static void sayHello(Person person) {
        String message = "";
        if (person instanceof Programmer) {
            Programmer programmer = (Programmer) person;
            message = "Hallo, " + programmer.getName() + ". I am a programmer with expertise in " + programmer.getTechnologi() + ".";
        } else if (person instanceof Doctor) {
            Doctor doctor = (Doctor) person;
            message = "Hello, " + doctor.getName() + ". I am a doctor with expertise in " + doctor.getSpeciality() + ".";
        } else if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            message = "Hello, " + teacher.getName() + ". I am a teacher with expertise in " + teacher.getSubject()+ ".";
        } else {
            System.out.println("I am a person");
        }
        System.out.println(message);
    }

}