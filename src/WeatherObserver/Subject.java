package WeatherObserver;

public interface Subject {  //主题接口
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
