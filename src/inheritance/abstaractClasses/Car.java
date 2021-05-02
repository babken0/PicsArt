package inheritance.abstaractClasses;

public abstract class Car extends Vehicle {
    int wheelCount;
    boolean isSport;




    public Car(String firmName, int weight, int publishedYear, int maxSpeed) {
        super(firmName, weight, publishedYear, maxSpeed);
    }


    public boolean getIsSport(){
        return isSport;
    }
    public int getWheelCount() {
        return wheelCount;
    }
    public  void setIsSport(boolean isSport){
        this.isSport = isSport;
    }
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

}

