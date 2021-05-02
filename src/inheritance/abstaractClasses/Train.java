package inheritance.abstaractClasses;

public abstract class Train extends Vehicle {
    int carriageCount;

    public int getCarriageCount() {
        return carriageCount;
    }

    public void setCarriageCount(int carriageCount) {
        this.carriageCount = carriageCount;
    }

    public Train(String firmName, int weight, int publishedYear, int maxSpeed) {
        super(firmName, weight, publishedYear, maxSpeed);
    }
}
