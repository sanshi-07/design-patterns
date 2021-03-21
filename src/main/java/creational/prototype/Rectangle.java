package main.java.creational.prototype;

/**
 * 这里展示了，一个具体实现类，其他和这里一样
 */
public class Rectangle extends Shape {

    /**
     * 同样这里也是，完成具体实现类需要的构造
     */
    public Rectangle() {
        this.type = "rectangle";
    }

    /**
     * 这里只需要去实现具体该类的内容即可
     */
    @Override
    void draw() {
        System.out.println("rectangle");
    }
}
