package main.java.structural.decorator;

public class ShapeDecorator {
    public Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        this.shape.draw();
    }
}
