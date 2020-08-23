package Decorator;

/**
 * @author Jianshu
 * @time 20200822
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description ="House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
