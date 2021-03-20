package main.java.creational.builder;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

//    @Override
//    public Packing packing() {
//        return new Wrapper();
//    }

    @Override
    public float price() {
        return 11.4f;
    }
}
