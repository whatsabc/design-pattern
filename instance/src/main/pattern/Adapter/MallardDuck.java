package Adapter;

/**
 * @author Jianshu
 * @time 20200822
 */
public class MallardDuck implements Duck{
    public void quack() {
        System.out.println("Quack");
    }
    public void fly(){
        System.out.println("I'm flying");
    }
}
