package com.example;
import com.example.childs.Circle;
import com.example.childs.Triangle;

import com.example.parent.Shape;

public class Main {
    public static void main(String[] args) {
        Shape lingkaran = new Circle(7, "Merah");
        Shape segitiga = new Triangle(5, 10, "Biru");

        System.out.println("Luas lingkaran berwarna " + lingkaran.getColor() + " adalah " + lingkaran.getArea());
        System.out.println("Luas segitiga berwarna " + segitiga.getColor() + " adalah " + segitiga.getArea());
    }
}