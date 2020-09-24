package Decorator;

/**
 * @author Jianshu
 * @time 20200822
 *
 * 装饰者和代理模式
 *
 * 这两个设计模式看起来很像。对装饰器模式来说，装饰者（decorator）和被装饰者（decoratee）都实现同一个接口。
 * 对代理模式来说，代理类（proxy class）和真实处理的类（real class）都实现同一个接口。此外，不论我们使用哪一个模式，都可以很容易地在真实对象的方法前面或者后面加上自定义的方法。
 *
 * 然而，实际上，在装饰器模式和代理模式之间还是有很多差别的。装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。
 * 换句话说，用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息。因此，当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。
 * 并且，当我们使用装饰器模 式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。
 * 我们可以用另外一句话来总结这些差别：使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造。
 *
 * 装饰者模式和适配器模式
 * 装饰者模式和被装饰的类要实现同一个接口，或者装饰类是被装饰的类的子类。 适配器模式和被适配的类具有不同的接口。
 */

/**
 * 饮料具体类
 */
class Espresso implements Beverage{
    String description;
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

/**
 * 饮料具体类
 */
class HouseBlend implements Beverage{
    String description;
    public HouseBlend() {
        description ="House Blend Coffee";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return .89;
    }
}

/**
 * 装饰者类
 */
class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+",Mocha";
    }

    public double cost() {
        return .20+beverage.cost();
    }
}

public class Main {
    public static void main(String[] args){
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+beverage.cost());
        beverage=new Mocha(beverage);
        beverage=new Mocha(beverage);
        System.out.println(beverage.getDescription()+beverage.cost());
    }
}
