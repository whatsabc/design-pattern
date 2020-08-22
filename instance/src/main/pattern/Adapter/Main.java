package Adapter;

/**
 * 适配器模式
 * @author Jianshu
 * @time 20200822
 */
public class Main {
    public static void main(String[] args){
        MallardDuck mallardDuck=new MallardDuck();
        WildTurkey wildTurkey=new WildTurkey();
        Duck adapterDuck=new TurkeyAdapter(wildTurkey);
        adapterDuck.quack();
        adapterDuck.fly();
    }
}
