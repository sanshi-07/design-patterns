package main.java.creational.singletion;

public class DoubleCheckLocking {
    private static DoubleCheckLocking doubleCheckLocking;

    public DoubleCheckLocking() {
    }

    //DCL 是一种结合懒汉、饿汉三种模式优点的一种实现方式
    public static DoubleCheckLocking getInstance() {
        if (doubleCheckLocking == null) {
            synchronized (DoubleCheckLocking.class) {
                if (doubleCheckLocking == null) {
                    return new DoubleCheckLocking();
                }
            }
        }
        return doubleCheckLocking;
    }
}
