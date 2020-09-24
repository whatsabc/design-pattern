package Adapter;

/**
 * 适配器模式
 * @author Jianshu
 * @time 20200822
 */

/**
 * 火鸡类
 */
class WildTurkey implements Turkey{
    public void gobble() {
        System.out.println("Gobble gobble");
    }
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}

/**
 * 鸭子类
 */
class MallardDuck implements Duck{
    public void quack() {
        System.out.println("Quack");
    }
    public void fly(){
        System.out.println("I'm flying");
    }
}

/**
 * 适配器类
 * 伙计适配器，将火鸡改造成鸭子
 */
class TurkeyAdapter implements Duck{
    Turkey turkey;
    //构造器获取要适配对象的引用
    public TurkeyAdapter(Turkey turkey){
        this.turkey=turkey;
    }

    public void quack(){
        turkey.gobble();
    }

    public void fly(){
        for(int i=0;i<5;i++){
            turkey.fly();
        }
    }
}

public class Main {
    public static void main(String[] args){
        MallardDuck mallardDuck=new MallardDuck();
        WildTurkey wildTurkey=new WildTurkey();
        Duck adapterDuck=new TurkeyAdapter(wildTurkey);
        adapterDuck.quack();
        adapterDuck.fly();
    }
}
