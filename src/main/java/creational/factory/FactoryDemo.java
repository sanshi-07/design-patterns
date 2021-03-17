package main.java.creational.factory;


public class FactoryDemo {

    public static ShapeFactory factory = new ShapeFactory();

    public static void main(String[] args) {
        //简单工厂模型，同过shapefactray去获取相应的shape
        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();
        Shape square = factory.getShape("square");
        square.draw();
        Shape circle = factory.getShape("circle");
        circle.draw();
    }

}
