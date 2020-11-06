package Strategy;

/**
 * @author Jianshu
 * @since 20200822
 */
public abstract class Duck {
    Strategy.FlyBehavior flyBehavior;
    Strategy.QuackBehavior quackBehavior;

    public Duck(){
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }

    //实例化对象时可以动态的改变对象的行为(比继承灵活性强)
    public void setFlyBehavior(Strategy.FlyBehavior fb){
        flyBehavior=fb;
    }

    //实例化对象时可以动态的改变对象的行为
    public void setQuackBehavior(Strategy.QuackBehavior qb){
        quackBehavior=qb;
    }
}
