package lesson4;

public class Reptile extends Animal{
    @Override
    public void move() {
        System.out.println("Reptile crawls");
    }

    public Reptile(String name, int age, int weight) {
        super(name, age, weight);
    }
}
