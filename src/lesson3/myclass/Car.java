package lesson3.myclass;

import java.time.LocalDate;

public class Car{
    private String model;
    private LocalDate productionData;
    private Color color;
    private int wellSize;
    private int maxSpeed;

    public enum Color{Blue,Black,Gray,Red,White,Green,Yellow}

    @Override
    public String toString() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(String model, LocalDate productionData, Color color, int wellSize, int maxSpeed) {
        this.model = model;
        this.productionData = productionData;
        this.color = color;
        this.wellSize = wellSize;
        this.maxSpeed = maxSpeed;
    }

    public void move(){
        System.out.println(model + " is driving.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getProductionData() {
        return productionData;
    }

    public void setProductionData(LocalDate productionData) {
        this.productionData = productionData;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWellSize() {
        return wellSize;
    }

    public void setWellSize(int wellSize) {
        this.wellSize = wellSize;
    }
}
