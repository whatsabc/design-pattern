package Factory;

import java.util.ArrayList;

/**
 * @author Jianshu
 * @time 20200822
 */

/**
 * 要制造的商品
 */
class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough");
        System.out.println("Adding sauce");
        System.out.println("Adding toppings: ");
        for (int i=0; i< toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    String getName() {
        return name;
    }
}

/**
 *
 */
class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name="NY style Sauce and Cheese pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}

class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    public void cut(){
        System.out.println("Cutting the pizza into square slice");
    }
}

class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else if (item.equals("veggie")) {
            //return new NYStyleVeggiePizza();
        }
        else if (item.equals("clam")) {
            //return new NYStyleClamPizza();
        }
        else if (item.equals("pepperoni")) {
            //return new NYStylePepperoniPizza();
        }
        else
            return null;
        return null;
    }
}

public class Main {
    public static void main(String[] args){
        PizzaStore pizzaStore=new NYPizzaStore();
        Pizza pizza=pizzaStore.orderPizza("cheese");
    }
}
