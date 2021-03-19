package main.java.creational.singletion;


public enum EnumSingleton {
    INSTANCE;
    /*
      枚举 实现单例模式  能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化
      实际中比较少使用
     */
    public void whateverMethod() {

    }
}
