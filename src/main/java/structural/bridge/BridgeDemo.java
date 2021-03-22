package main.java.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {

        //Shape是抽象的，我们通过下面的方式实现 抽象调用具象  类似于灵魂 调动  肉体一样
        //需要新增方法时也如同 draw一样 ，在抽象中新增，在具象中实现
        Shape redCircle = new Cricle(new RedCircle(),100,100, 10 );
        Shape greenCircle = new Cricle(new GreenCircle(),100,100, 10);


        redCircle.draw();
        greenCircle.draw();
    }
}
