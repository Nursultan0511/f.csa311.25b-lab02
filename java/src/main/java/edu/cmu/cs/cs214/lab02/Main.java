package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        Renderer renderer1 = new Renderer(rectangle);
        Renderer renderer2 = new Renderer(circle);
        Renderer renderer3 = new Renderer(square);

        // Нийт талбайг тооцоолох
        double niitArea = rectangle.getArea() + circle.getArea() + square.getArea();

        // Дүрсүүдийг зурах
        renderer1.draw();
        renderer2.draw();
        renderer3.draw();
        Renderer perimetr1 = new Renderer(rectangle);
        Renderer perimetr2 = new Renderer(circle);
        Renderer perimetr3 = new Renderer(square);

        // Нийт талбайг тооцоолох
        double niitPerimetr = rectangle.getPerimetr() + circle.getPerimetr() + square.getPerimetr();

        // Дүрсүүдийг зурах
        perimetr1.draw();
        perimetr2.draw();
        perimetr3.draw();

        System.out.println("Нийт талбай: " + niitArea);

        System.out.println("Нийт Perimetr: " + niitPerimetr);
    }
}
