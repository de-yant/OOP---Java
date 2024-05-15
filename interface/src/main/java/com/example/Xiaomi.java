package com.example;
import com.interfaces.Phone;

public class Xiaomi {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50;
    }
    
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi menyala...");
        System.out.println("Selamat datang di Xiaomi");
        System.out.println("Android System Ready");
    }

    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi dimatikan");
    }

    public void powerUp() {
        if (isPowerOn) {
            if (this.volume == Phone.MAX_VOLUME) {
                System.out.println("Volume sudah penuh!");
                System.out.println("Volume = " + this.volume + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.volume);
            }
        } else {
            System.out.println("Nyalakan dulu HP-nya");
        }
    }

    public void powerDown() {
        if (isPowerOn) {
            if (this.volume == Phone.MIN_VOLUME) {
                System.out.println("Volume sudah penuh!");
                System.out.println("Volume = " + this.volume + "%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.volume);
            }
        } else {
            System.out.println("Nyalakan dulu HP-nya");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    
}
