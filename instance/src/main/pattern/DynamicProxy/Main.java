package DynamicProxy;

/**
 * @author Jianshu
 * @since 20200822
 */
public class Main {
    public static void main(String[] args){
        ProxyHandler proxyHandler=new ProxyHandler();
        IPrinter printer=(IPrinter)proxyHandler.newProxyInstance(new Printer());
        printer.print();
    }
}
