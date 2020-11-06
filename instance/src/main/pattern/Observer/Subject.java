package Observer;

/**
 * @author Jianshu
 * @since 20200823
 * 主题接口，在这里我们可以注册观察者和取消注册，并可以通知观察者
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
