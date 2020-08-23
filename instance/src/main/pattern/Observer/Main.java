package Observer;

/**
 * @author Jianshu
 * @time 20200823
 */
public class Main {
    public static void main(String[] args){
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
