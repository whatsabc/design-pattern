package Observer;

import java.util.ArrayList;

/**
 * @author Jianshu
 * @since 20200823
 */

/**
 * 布告板类，用于显示当前天气
 */
class CurrentConditionsDisplay implements Observer{
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
        System.out.println("Current conditions: "+temperature +" F degrees and " + humidity + " % humidity");
    }
}

/**
 * 主题类的实现类
 */
class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList<>();
    }

    //对观察者进行注册
    public void registerObserver(Observer o){
        observers.add(o);
    }

    //移除观察者对象
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    //通知观察者
    public void notifyObserver() {
        for (int i=0;i<observers.size();i++) {
            Observer observer=observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    // WeatherData的其他方法
}

public class Main {
    public static void main(String[] args){
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
