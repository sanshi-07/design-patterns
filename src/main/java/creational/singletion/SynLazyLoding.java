package main.java.creational.singletion;

public class SynLazyLoding {
    private static SynLazyLoding synLazyLoding;

    private SynLazyLoding() {

    }

    //线程安全懒汉模式，加锁防止多线程同时进入==判断，导致重复new新对象
    public static synchronized SynLazyLoding getInstance() {
        if (synLazyLoding == null) {
            return new SynLazyLoding();
        }
        return synLazyLoding;
    }
}