package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Xiaomi redmiNote10 = new Xiaomi();
        PhoneUser user = new PhoneUser(redmiNote10);
        user.turnOnThePhone();

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int pilihan;
        boolean isLanjutkan = true;

        do {
            System.out.println("MENU");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Volume naik");
            System.out.println("[4] Volume turun");
            System.out.println("[5] Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    user.turnOnThePhone();
                    break;
                case 2:
                    user.turnOffThePhone();
                    break;
                case 3:
                    user.volumeUp();
                    break;
                case 4:
                    user.volumeDown();
                    break;
                case 5:
                    isLanjutkan = false;
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (isLanjutkan);
    }
}
