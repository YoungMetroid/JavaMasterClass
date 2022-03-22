package Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Displays;

import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.IDisplayElement;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.IObserver;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.ISubject;

public class StatisticsIDisplay implements IObserver, IDisplayElement
{
    private float maxTemperature = 0.0f;
    private float minTemperature = 200;
    private float temperatureSum = 0.0f;
    private int numReadings;
    private ISubject weatherData;

    public StatisticsIDisplay(ISubject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update()
    {
        float temperature = weatherData.getTemperature();
        temperatureSum += temperature;
        numReadings++;

        if(temperature > maxTemperature)
        {
            maxTemperature = temperature;
        }
        if(temperature < minTemperature)
        {
            minTemperature = temperature;
        }
        display();
    }

    public void display()
    {
        System.out.println("Avg/Max/Min temperature = " + (temperatureSum / numReadings)
                + "/" + maxTemperature + "/" + minTemperature);
    }
}
