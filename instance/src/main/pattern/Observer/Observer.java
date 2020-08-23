package Observer;

public interface Observer {
    public void update (float temp,float humidity,float pressure);//所有的观察者都必须实现update()方法，以实现观察者接口
}
