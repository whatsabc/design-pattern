package Decorator;

/**
 * @author Jianshu
 * @time 20200822
 * 具体调料类
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;//被装饰者

    public Mocha(Beverage beverage){
        this.beverage = beverage;//让被装饰者被记录到实例变量中
    }

    public String getDescription(){
        return beverage.getDescription()+", Mocha";
    }

    public double cost() {
        return .20+beverage.cost();
    }
}
