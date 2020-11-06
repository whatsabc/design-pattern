package CglibProxy;

/**
 * @author Jianshu
 * @since 20200822
 */
public class Main {
    public static void main(String[] args){
        Printer printer=new Printer();
        Printer proxy=(Printer)new ProxyFactory(printer).getProxyInstance();
        proxy.print();
    }
}
