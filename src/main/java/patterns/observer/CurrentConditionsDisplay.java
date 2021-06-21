package patterns.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float tmp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float tmp, float humidity, float pressure) {
        this.tmp = tmp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + tmp + "F degrees and " + humidity + "% humidity");
    }
}
