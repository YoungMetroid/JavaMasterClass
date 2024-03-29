package Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Displays;

import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.IDisplayElement;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.IObserver;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis.ISubject;

public class HeatIndexDisplay implements IObserver, IDisplayElement
{
    private ISubject weatherData;
    float heatIndex = 0.0f;

    public HeatIndexDisplay(ISubject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update()
    {
        heatIndex = computeHeatIndex(weatherData.getTemperature(),weatherData.getHumidity());
        display();
    }

    private float computeHeatIndex(float temperature, float relativeHumidity)
    {
        float index = (float)((16.923 + (0.185212 * temperature) + (5.37941 * relativeHumidity) - (0.100254 * temperature * relativeHumidity)
                + (0.00941695 * (temperature * temperature)) + (0.00728898 * (relativeHumidity * relativeHumidity))
                + (0.000345372 * (temperature * temperature * relativeHumidity)) - (0.000814971 * (temperature * relativeHumidity * relativeHumidity)) +
                (0.0000102102 * (temperature * temperature * relativeHumidity * relativeHumidity)) - (0.000038646 * (temperature * temperature * temperature)) + (0.0000291583 *
                (relativeHumidity * relativeHumidity * relativeHumidity)) + (0.00000142721 * (temperature * temperature * temperature * relativeHumidity)) +
                (0.000000197483 * (temperature * relativeHumidity * relativeHumidity * relativeHumidity)) - (0.0000000218429 * (temperature * temperature * temperature * relativeHumidity * relativeHumidity)) +
                0.000000000843296 * (temperature * temperature * relativeHumidity * relativeHumidity * relativeHumidity)) -
                (0.0000000000481975 * (temperature * temperature * temperature * relativeHumidity * relativeHumidity * relativeHumidity)));
        return index;
    }

    @Override
    public void display()
    {
        System.out.println("Heat index is " + heatIndex);
    }
}
