package WeatherObserver;

public interface Observer {  //所有的气象组件都实现此 观察者接口，这样，主题在需要通知观察者时，有了一个共同的接口
    public void update(float temperature, float humidity, float pressure);
}
