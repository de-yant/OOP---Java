package com.example;

public  class Doctor extends Person{
    String speciality;

    public Doctor() {
        //TODO Auto-generated constructor stub
    }

    public Doctor(String name, String address, String speciality) {
        super(name, address);
        this.speciality = speciality;
    }

    void treatPatient() {
        System.out.println("I treat patients with " + speciality);
    }

    @Override
    void greet() {
        super.greet();
        System.out.println("I am a doctor with speciality " + speciality);
    }
    
}
