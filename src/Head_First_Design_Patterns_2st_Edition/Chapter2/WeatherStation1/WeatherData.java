package Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1;

import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.IObserver;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.ISubject;

import java.util.ArrayList;

public class WeatherData implements ISubject
{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public  WeatherData()
    {
        observers = new ArrayList();
    }
    public void registerObserver(IObserver o)
    {
        observers.add(o);
    }
    public void removeObserver(IObserver o)
    {
        int index = observers.indexOf(o);
        if(index >=0)
        {
            observers.remove(index);
        }
    }

    public void notifyObservers()
    {
        for(int index = 0; index < observers.size(); index++)
        {
            IObserver IObserver = (IObserver)observers.get(index);

            IObserver.update(temperature,humidity,pressure);
        }
    }
    public void measuementsChanged()
    {
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature =temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measuementsChanged();
    }
}
