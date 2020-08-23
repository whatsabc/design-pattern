package Observer;

/**
 * @author Jianshu
 * @time 20200823
 * 布告板类，用于显示当前天气
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    //构造器需要weatherData对象（也就是主题）作为注册之用
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;//当update被调用时，我们把温度和适度保存起来，然后调用display()显示它们
        display();
    }

    public void display() {
        System.out.println("Current conditions: "+temperature +"F degrees and" + humidity + "% humidity");
    }
}
