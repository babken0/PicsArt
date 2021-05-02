package inheritance.classes;

import inheritance.abstaractClasses.Car;
import inheritance.interfaces.Cargo;

public class Truck extends Car implements Cargo {
    int maxCargoWeight;
    public Truck(String firmName, int weight, int publishedYear, int maxSpeed) {
        super(firmName, weight, publishedYear, maxSpeed);
    }

    @Override
    public void moveProduct(String from, String to, int productWeight) {
        System.out.println("Truck move product from " + from + " to " + to);
    }

    public int getMaxCargoWeight() {
        return maxCargoWeight;
    }

    public void setMaxCargoWeight(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "wheelCount=" + getWheelCount() +
                ", isSport=" + getIsSport() +
                ", maxCargoWeight=" + maxCargoWeight +
                ", firmName='" + getFirmName() + '\'' +
                ", weight=" + getWeight() +
                ", publishedYear=" + getPublishedYear() +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}

