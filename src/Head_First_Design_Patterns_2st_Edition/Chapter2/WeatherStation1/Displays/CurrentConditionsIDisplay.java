package Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Displays;

import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.IDisplayElement;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.IObserver;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.ISubject;

public class CurrentConditionsIDisplay implements IObserver, IDisplayElement
{
    private float temperature;
    private float humidity;
    private ISubject weatherData;


    public CurrentConditionsIDisplay(ISubject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float huidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = huidity;
        display();
    }

    public void display()
    {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
