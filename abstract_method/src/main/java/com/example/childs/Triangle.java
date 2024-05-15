package com.example.childs;
import com.example.parent.Shape;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height, String color){
        setColor(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){
        return 0.5 * base * height;
    }
    
}
