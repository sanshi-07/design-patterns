package main.java.creational.builder;

/*
 * Build模式，居于底层实现类变化不大，而上面需要的是其组成的不同模式，所以可对底层进行抽象
 *           中间抽象出一个类承载需要的组合
 *           然后通过一个builder 去完成组装需要的 具体中间类
 */
public interface Item {

    String name();

    Packing packing();

    float price();
}
