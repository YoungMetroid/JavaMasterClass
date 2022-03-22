package Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Displays;

import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.IDisplayElement;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.IObserver;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.ISubject;

public class ForecastIDisplay implements IObserver, IDisplayElement
{
    private float currentPressure = 29.92f;
    private float lastPressure;
    private ISubject weatherData;


    public ForecastIDisplay(ISubject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update()
    {
        lastPressure = currentPressure;
        currentPressure= weatherData.getPressure();
        display();
    }

    public void display()
    {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
