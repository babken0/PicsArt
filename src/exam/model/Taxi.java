package exam.model;

public class Taxi {
    private String model;
    private String country;
    private int year;
    private int mileage;
    private boolean sport;
    private int weight ;
    private int topSpeed ;
    private int seats;
    private double cost ;

    public Taxi(String model, String country, int year, double cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.cost = cost;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int milage) {
        this.mileage = milage;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", made in " + country + ", publishing year: "+ year + "\n"
                + "mileage: " + mileage + ", " + (sport ? "Sport car, ":"Not Spot car, ") + "weight: " + weight+ "\n"
        + "Top speed:" + topSpeed + ", Seat count: " + seats + ", Cost: " + cost + "$ \n";
    }
}
