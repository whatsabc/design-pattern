package Strategy;

/**
 * @author Jianshu
 * @time 20200822
 */

class FlyNoWay implements FlyBehavior{
    public void fly(){
        System.out.println("I can't fly");
    }
}

class FlyRocketPowered implements FlyBehavior{
    public void fly(){
        System.out.println("I'm flying with a rocket!!!");
    }
}

class FlyWithWings implements FlyBehavior{
    public void fly(){
        System.out.println("i'm flying");
    }
}

class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("Squeak");
    }
}

class Quack implements QuackBehavior{
    public void quack() {
        System.out.println("Quack");
    }
}

class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }
    public void display(){
        System.out.println("I'm a model duck");
    }
}

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck=new ModelDuck();
        duck.performQuack();
        duck.performFly();
        duck.display();
        duck.setFlyBehavior(new FlyRocketPowered());//运行时改变飞行状态
        duck.performFly();
    }
}
