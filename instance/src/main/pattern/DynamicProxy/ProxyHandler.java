package DynamicProxy;

/**
 * @author Jianshu
 * @since 20200822
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {
    private Object targetObject;//被代理的对象
    //将被代理的对象传入获得它的类加载器和实现接口作为Proxy.newProxyInstance方法的参数。
    public  Object newProxyInstance(Object targetObject){
        this.targetObject = targetObject;
        //targetObject.getClass().getClassLoader()：被代理对象的类加载器
        //targetObject.getClass().getInterfaces()：被代理对象的实现接口
        //this 当前对象，该对象实现了InvocationHandler接口所以有invoke方法，通过invoke方法可以调用被代理对象的方法
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }
    //该方法在代理对象调用方法时调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("打印前");
        Object returnValue=method.invoke(targetObject,args);
        System.out.println("打印前");
        return returnValue;
    }
}
