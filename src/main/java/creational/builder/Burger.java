package main.java.creational.builder;

abstract class Burger implements Item {

    /*
     *将抽象内容往上提，而不是放到VegBurger这样的具体实现类完成，codedrink同理
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
