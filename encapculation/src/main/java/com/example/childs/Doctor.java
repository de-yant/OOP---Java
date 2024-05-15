package com.example.childs;
import com.example.parent.Person;

public  class Doctor extends Person{
    private String speciality;

    public Doctor() {
        //TODO Auto-generated constructor stub
    }

    public Doctor(String name, String address, String speciality) {
        super(name, address);
        this.speciality = speciality;
    }

    public void treatPatient() {
        System.out.println("I treat patients with " + speciality);
    }

    @Override
    public void greet() {
        super.greet();
        System.out.println("I am a doctor with speciality " + speciality);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
}
