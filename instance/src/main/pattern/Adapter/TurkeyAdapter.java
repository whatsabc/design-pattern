package Adapter;

/**
 * 适配器
 * @author Jianshu
 * @time 20200822
 */
public class TurkeyAdapter implements Duck{
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
