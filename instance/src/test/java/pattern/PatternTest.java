package pattern;

import Builder.SimpleUser;
import Builder.User;
import CglibProxy.Printer;
import CglibProxy.ProxyFactory;
import DynamicProxy.IPrinter;
import DynamicProxy.ProxyHandler;
import Singleton.EagerSingleton;
import Singleton.LazySingleton;
import StaticProxy.StaticProxy;
import org.junit.Test;

/**
 * @author Jianshu
 * @since 20201106
 */
public class PatternTest {

    @Test
    public void staticProxy(){
        StaticProxy printerProxy = new StaticProxy();
        printerProxy.print();
    }

    /**
     * JDK9及以上版本会有警告：
     * WARNING: An illegal reflective access operation has occurred
     * WARNING: Illegal reflective access by net.sf.cglib.core.ReflectUtils$1 (file:/C:/Users/Jianshu/.m2/repository/cglib/cglib/3.3.0/cglib-3.3.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
     * WARNING: Please consider reporting this to the maintainers of net.sf.cglib.core.ReflectUtils$1
     * WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
     * WARNING: All illegal access operations will be denied in a future release
     */
    @Test
    public void cglibProxy(){
        Printer printer=new Printer();
        Printer proxy=(Printer)new ProxyFactory(printer).getProxyInstance();
        proxy.print();
    }

    @Test
    public void dynamicProxy(){
        ProxyHandler proxyHandler=new ProxyHandler();
        IPrinter printer=(IPrinter)proxyHandler.newProxyInstance(new DynamicProxy.Printer());
        printer.print();
    }

    @Test
    public void builder(){
        User user=new User.UserBuilder("c","js").age(21).build();
        System.out.println(user.toString());

        SimpleUser newUser=new SimpleUser("cai","jianshu").age(10);
        System.out.println(newUser.toString());
    }

    @Test
    public void singleton(){
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
