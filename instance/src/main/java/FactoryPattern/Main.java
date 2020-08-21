package FactoryPattern;

public class Main {
    public static void main(String[] args){
        PizzaStore pizzaStore=new NYPizzaStore();
        Pizza pizza=pizzaStore.orderPizza("cheese");
    }
}
