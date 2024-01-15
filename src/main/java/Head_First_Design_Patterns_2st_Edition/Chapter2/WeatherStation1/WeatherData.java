package Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1;

import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.IObserver;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.ISubject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject
{
    private List<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public  WeatherData()
    {
        observers = new ArrayList<IObserver>();
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

            IObserver.update();
        }
    }
    public void measurementsChanged()
    {
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature =temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public float getHumidity() {
        return humidity;
    }

    @Override
    public float getPressure() {
        return pressure;
    }
}
