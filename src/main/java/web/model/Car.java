package web.model;

import java.util.List;

public class Car {
    private String model;
    private String color;
    private int cost;

    public static List<Car> cars = List.of(new Car("Lada", "gray", 1000),
            new Car("BMW", "black", 5000),
            new Car("kia", "red", 2500),
            new Car("Mercedes", "orange", 3500),
            new Car("Renault", "blue", 800));

    public Car() {
    }

    public Car(String model, String color, int cost) {
        this.model = model;
        this.color = color;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
