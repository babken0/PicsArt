package inheritance.abstaractClasses;

public abstract class Airplane extends Vehicle {
    double wingLength;
    int motorCount;
    public Airplane(String firmName, int weight, int publishedYear, int maxSpeed) {
        super(firmName, weight, publishedYear, maxSpeed);
    }

    public double getWingLength() {
        return wingLength;
    }

    public void setWingLength(double wingLength) {
        this.wingLength = wingLength;
    }

    public int getMotorCount() {
        return motorCount;
    }

    public void setMotorCount(int motorCount) {
        this.motorCount = motorCount;
    }
}
