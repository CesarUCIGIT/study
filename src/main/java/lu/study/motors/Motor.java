package main.java.lu.study.motors;

import java.util.Objects;


/**
 * This is an abstract class that cannot be instantiated
 */
public abstract class Motor {
    private String brand;
    private String model;
    private Double maxSpeed;

    public Motor(String name, Double maxSpeed, String model) {
        this.brand = name;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;
        return Objects.equals(brand, motor.brand) && Objects.equals(model, motor.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
