package Strategy;

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
