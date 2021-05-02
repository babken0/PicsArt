package inheritance.classes;

import inheritance.abstaractClasses.Car;
import inheritance.interfaces.Passenger;

public class Bus extends Car implements Passenger {
    private int seatCount;
    public Bus(String firmName, int weight, int publishedYear, int maxSpeed) {
        super(firmName, weight, publishedYear, maxSpeed);
    }

    @Override
    public void movieHuman(String from, String to, int humanCount) {
        System.out.println("Bus transport "+ humanCount + " human from " + from + " to " + to);
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "firmName=" + getFirmName() +
                ", isSport=" + getIsSport() +
                ", seatCount=" + getSeatCount() +
                ", WheelCout='" + getWheelCount() + '\'' +
                ", weight=" + getWeight() +
                ", publishedYear=" + getPublishedYear() +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}
