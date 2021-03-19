package main.java.creational.singletion;

public class LazyLoading {
    private static LazyLoading lazyLoading;

    private LazyLoading() {

    }

    //线程不安全懒汉模式，懒汉具体指lazy加载，只有用时加载，所以为懒汉
    public static LazyLoading getInstance() {
        if (lazyLoading == null) {
            return new LazyLoading();
        }
        return lazyLoading;
    }
}
