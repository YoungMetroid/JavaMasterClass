package Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1;

import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Displays.CurrentConditionsIDisplay;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Displays.ForecastIDisplay;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Displays.HeatIndexDisplay;
import Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Displays.StatisticsIDisplay;

public class WeatherStation
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsIDisplay currentConditionsDisplay = new CurrentConditionsIDisplay(weatherData);
        StatisticsIDisplay statisticsDisplay = new StatisticsIDisplay(weatherData);
        ForecastIDisplay forecastDisplay = new ForecastIDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);



        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);

        weatherData.removeObserver(heatIndexDisplay);

    }
}
