package WeatherObserver.JavaUtil;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void measurementsChanged() {  //我们没有调用notityObservers()传送数据对象，这表示我们采用的是“拉”
        setChanged();    //在调用notifyObservers()之前要先调用setChanged()来指示状态已发生改变
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
