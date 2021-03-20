package main.java.creational.builder;

import java.util.ArrayList;

/**
 * 这里就是 中间的承载类
 */
public class Meal {
    public ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
        }
    }

    public float getCost() {
        //这里对iterns求和
        return 0;
    }

    public ArrayList<Item> showIterns() {
        return this.items;
    }
}
