package web.models;

public class Car {

    private int series;
    private String model;
    private String country;

    public Car(int series, String model, String country) {
        this.series = series;
        this.model = model;
        this.country = country;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", model='" + model + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}