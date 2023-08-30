package web.Model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int series;
    private String model;
    private double horsePower;

    public static List<Car> cars;

    static {
        cars = new ArrayList<>();

        cars.add(new Car(512, "Subaru", 120));
        cars.add(new Car(572, "Honda", 107));
        cars.add(new Car(901, "Toyota", 167));
        cars.add(new Car(125, "Mitsubishi", 148));
        cars.add(new Car(673, "Lada", 75));
    }

    public Car(int series, String model, double horsePower) {
        this.series = series;
        this.model = model;
        this.horsePower = horsePower;
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

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
