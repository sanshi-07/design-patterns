package main.java.structural.bridge;

public class Cricle extends Shape {
    private int radius;
    private int x;
    private int y;

    public Cricle(DrawAPI drawAPI, int radius, int x, int y) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void Draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
