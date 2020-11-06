package CglibProxy;

/**
 * @author Jianshu
 * @since 20200822
 */
import StaticProxy.IPrinter;

public class Printer implements IPrinter {
    public void print(){
        System.out.println("打印");
    }
}
