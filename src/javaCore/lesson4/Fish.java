package javaCore.lesson4;

public class Fish extends Animal{
    private double tailWidth;
    public Fish(String name, int age, int legCount,double tailWidth) {
        super(name, age, legCount);
        this.tailWidth = tailWidth;
    }

    @Override
    public void move() {
        System.out.println("Fish swims");
    }
}
