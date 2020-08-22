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

        Runnable runnable=new Runnable(){
            public void run(){
                System.out.println(LazySingleton.getInstance().hashCode());
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
