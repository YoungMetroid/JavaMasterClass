package Head_First_Design_Patterns_2st_Edition.Chapter2.WeatherStation1.Apis;

public interface ISubject {
    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObservers();
}
