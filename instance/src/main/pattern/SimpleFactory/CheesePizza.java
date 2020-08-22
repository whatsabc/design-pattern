package SimpleFactory;

/**
 * @author Jianshu
 * @time 20200822
 */
public class CheesePizza extends Pizza{

    public CheesePizza() {
        name="Cheese pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
