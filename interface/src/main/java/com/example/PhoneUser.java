package com.example;

public class PhoneUser {
    private Xiaomi phone;

    public PhoneUser(Xiaomi redmiNote10) {
        this.phone = redmiNote10;
    }

    public void turnOnThePhone() {
        phone.powerOn();
    }

    public void turnOffThePhone() {
        phone.powerOff();
    }

    public void volumeUp() {
        phone.powerUp();
    }

    public void volumeDown() {
        phone.powerDown();
    }
    //get dan ser
    public Xiaomi getPhone() {
        return phone;
    }

    public void setPhone(Xiaomi phone) {
        this.phone = phone;
    }
    
}
