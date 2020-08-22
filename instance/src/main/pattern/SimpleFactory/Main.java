package SimpleFactory;

/**
 * @author Jianshu
 * @time 20200822
 */
public class Main {
    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory=new SimplePizzaFactory();
        PizzaStore pizzaStore=new PizzaStore(simplePizzaFactory);
        Pizza pizza=pizzaStore.orderPizza("cheese");
    }
}
