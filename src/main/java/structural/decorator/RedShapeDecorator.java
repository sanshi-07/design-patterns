package main.java.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {


    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        this.shape.draw();
        setRedBorder();
    }

    /**
     * 这里可视 需求 往decorator装饰类中添加
     */
    public void setRedBorder() {
        System.out.println("Border Color: red");
    }

}
