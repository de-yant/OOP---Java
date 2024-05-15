package com.example.childs;
import com.example.parent.Shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius, String color){
        setColor(color);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
}
