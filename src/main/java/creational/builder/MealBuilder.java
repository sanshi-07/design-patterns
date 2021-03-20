package main.java.creational.builder;

/*
 * 这里完成组装，coder 只需要在这里添加方法，组装自己需要的组合类就行
 *    在需要的地方实例化本类，调用方法；或者将本类中的方法设为static
 *    不需要管底层基类
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
