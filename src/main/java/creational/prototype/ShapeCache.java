package main.java.creational.prototype;

import java.util.Hashtable;

/**
 * 这个类中我们将存放我们的具体实习prototype
 * 充当一个Cache，对于是否要lazy loading ，可视具体业务而定
 */
public class ShapeCache {


    private static Hashtable<String, Shape> shapeMap =
            new Hashtable<>();

    /**
     * 这里就是对外提供的获取clone object 的方法
     * @param shapeId
     * @return
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        //通过prototype。clone 拿到一个深拷贝对象
        return (Shape) cachedShape.clone();
    }

    /**
     * 这里完成prototype的装载，有多个时同Rectangle
     */
    public static void LoadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(), rectangle);

//        Circle circle = new Circle();
//        circle.setId("1");
//        shapeMap.put(circle.getId(),circle);
//
//        Square square = new Square();
//        square.setId("2");
//        shapeMap.put(square.getId(),square);
    }

}
