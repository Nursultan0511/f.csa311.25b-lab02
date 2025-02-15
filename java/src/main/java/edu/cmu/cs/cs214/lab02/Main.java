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

        renderer1.draw();
        renderer2.draw();
        renderer3.draw();
    }
}
