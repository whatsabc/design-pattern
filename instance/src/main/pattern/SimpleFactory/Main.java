package SimpleFactory;

import java.util.ArrayList;

/**
 * @author Jianshu
 * @time 20200822
 */

class Pizza {

    String name;
    String dough;
    String sauce;

    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
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

class CheesePizza extends Pizza{
    public CheesePizza() {
        name="Cheese pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}

class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza=null;
        if(type.equals("cheese")){
            pizza=new CheesePizza();
        }
        else if(type.equals("pepperoni")){
            //pizza=new PepperoniPizza();
        }
        else if(type.equals("clam" )){
            //pizza=new ClamPizza();
        }
        else if(type.equals("veggie")) {
            //pizza=new VeggiePizza();
        }
        return pizza;
    }
}

class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory=factory;
    }
    public Pizza orderPizza(String type) {
        Pizza pizza=factory.createPizza(type);
        pizza.prepare();
        pizza.bake ();
        pizza.cut ();
        pizza.box();
        return pizza;
    }
    //其他方法
}

public class Main {
    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory=new SimplePizzaFactory();
        PizzaStore pizzaStore=new PizzaStore(simplePizzaFactory);
        Pizza pizza=pizzaStore.orderPizza("cheese");
    }
}
