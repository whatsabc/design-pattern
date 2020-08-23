package CglibProxy;

/**
 * @author Jianshu
 * @time 20200822
 */
import StaticProxy.IPrinter;

public class Printer implements IPrinter {
    public void print(){
        System.out.println("打印");
    }
}
