package main.java.creational.singletion;


public class StaticInnerClass {

    private static class SingleTonHolder {
        private static StaticInnerClass staticInnerClass = new StaticInnerClass();
    }

    private StaticInnerClass() {
    }

    /*
      静态内部类可以理解为顶级类，只有在使用时才执行类加载（加载中完成静态代码执行），因为单例是静态属性只执行一次。
      这样与饿汉食不同的是，达到了一种lazy loading的效果
     */
    public static StaticInnerClass getInstance() {
        return SingleTonHolder.staticInnerClass;
    }
}


