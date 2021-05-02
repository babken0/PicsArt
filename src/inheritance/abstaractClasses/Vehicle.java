package inheritance.abstaractClasses;

public abstract class Vehicle {
    String firmName;
    int weight;
    int publishedYear;
    int maxSpeed;
    void movie(){
        System.out.println("Vehicle is moving");
    }

    public Vehicle(String firmName, int weight, int publishedYear, int maxSpeed) {
        this.firmName = firmName;
        this.weight = weight;
        this.publishedYear = publishedYear;
        this.maxSpeed = maxSpeed;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
