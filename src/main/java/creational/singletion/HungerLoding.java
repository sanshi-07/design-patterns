package main.java.creational.singletion;

public class HungerLoding {
    private static HungerLoding hungerLoding = new HungerLoding();

    public HungerLoding() {
    }

    //饿汉模式使：本质上就像饿汉一样必须马上吃上。但缺点在于这样会在类加载时就带来不必要的内存开销
    public static HungerLoding getInstance() {
        return hungerLoding;
    }

}
