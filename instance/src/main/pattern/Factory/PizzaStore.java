package Factory;

/**
 * @author Jianshu
 * @since 20200822
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
