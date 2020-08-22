package Singleton;

/**
 * 单例模式（懒汉模式）
 * 如果是多线程下，一个线程已经进入了if(instance==null) 但是还没来得及实例化，这时候另外一个线程也进入了if(instance==null) ，
 * 这时便会产生多个实例，所以在多线程的情况下不能使用这种懒汉式加载
 * @author Jianshu
 * @time 20200822
 */
public class LazySingleton {
    private static LazySingleton uniqueInstance;//利用一个静态变量来记录Singleton类的唯一实例
    //这里是其他的有用实例化变量
    private LazySingleton(){//只有Singleton类内才可以调用构造器
    }

    //静态，同步，公开访问点
    public static synchronized LazySingleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new LazySingleton();
        }
        //如果uniqueInstance不是null，就表示之前已经创建过对象，直接跳到return语句
        return uniqueInstance;//当执行到这个return，就表示我们已经有了实例，并将uniqueInstance当返回值
    }
}
