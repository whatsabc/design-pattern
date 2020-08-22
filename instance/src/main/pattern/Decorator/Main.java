package Decorator;

public class Main {
    public static void main(String[] args){
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+beverage.cost());
        beverage=new Mocha(beverage);
        beverage=new Mocha(beverage);
        System.out.println(beverage.getDescription()+beverage.cost());
    }
}
