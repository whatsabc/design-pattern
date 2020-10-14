package Singleton;

/**
 * 单例模式
 * @author Jianshu
 * @time 20200822
 */
public class Main {
    public static void main(String[] args){
        System.out.println(EagerSingleton.getInstance().hashCode());
        System.out.println(EagerSingleton.getInstance().hashCode());

        Thread threadA=new Thread(new Runnable(){
            public void run(){
                System.out.println(LazySingleton.getInstance().hashCode());
            }
        });
        Thread threadB=new Thread(new Runnable(){
            public void run(){
                System.out.println(LazySingleton.getInstance().hashCode());
            }
        });
        threadA.start();
        threadB.start();
    }
}
