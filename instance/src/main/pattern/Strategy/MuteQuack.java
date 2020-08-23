package Strategy;

/**
 * @author Jianshu
 * @time 20200822
 */
public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
