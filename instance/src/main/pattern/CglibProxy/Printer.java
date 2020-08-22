package CglibProxy;

import StaticProxy.IPrinter;

public class Printer implements IPrinter {
    public void print(){
        System.out.println("打印");
    }
}
