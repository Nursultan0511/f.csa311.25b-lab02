package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    private Shape shape;  // Rectangle биш, бүх Shape төрлийн объект авах

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        double area = shape.getArea();
        System.out.println("Shape printed\n" + "Its area is " + area);
    }
    public void Perimtr() {
        double perimtr = shape.getPerimetr();
        System.out.println("Shape printed\n" + "Its perimetr is " + perimtr);
    }
}

