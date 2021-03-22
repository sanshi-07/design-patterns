package main.java.structural.bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("RedCircle :" + radius + x + y);
    }
}
