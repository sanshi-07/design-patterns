package main.java.creational.prototype;

/**
 * 同样这里将基类进行了抽象，继承的具体类只需要去重写抽象方法即可
 * 同时对type赋予具体的值
 */
public abstract class Shape implements Cloneable {

    /**
     * 进行Cache 存放时，可用作k-y 中的key进行标记
     */
    private String id;

    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 这里的clone是deep clone
     * 对外提供对象时只需要调用该方法，获取一个clone对象即可
     * 因为时直接调用native方法，prototype进行的copy，跳过了构造代码
     * 和构造方法的执行，所以性能比直接new一个实例对象快
     *
     * @return
     */
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
