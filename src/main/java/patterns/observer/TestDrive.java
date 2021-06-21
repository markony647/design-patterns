package patterns.observer;

public class TestDrive {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(5.0f, 6.0f, 7.0f);
        weatherData.setMeasurements(80.0f, 90.0f, 220.0f);
        weatherData.setMeasurements(66.0f, 33.0f, 66.0f);
    }
}
