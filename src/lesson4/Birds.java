package lesson4;

public class Birds extends Animal{
    private double wingLength;

    public Birds(String name, int age, int weight,double wingLength) {
        super(name, age, weight);
        this.wingLength = wingLength;
    }

    @Override
    public void move() {
        System.out.println("Birds flies");
    }


}
