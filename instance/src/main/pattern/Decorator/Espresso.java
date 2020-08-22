package Decorator;

/**
 * @author Jianshu
 * @time 20200822
 * 饮料具体类
 */
public class Espresso extends Beverage{
    public Espresso(){
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
