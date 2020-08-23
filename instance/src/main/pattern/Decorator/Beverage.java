package Decorator;

/**
 * @author Jianshu
 * @time 20200822
 */
public abstract class Beverage {
    String description="Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
