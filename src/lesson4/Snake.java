package lesson4;

public class Snake extends Reptile{
    private boolean isPoisonous;
    public Snake(String name, int age, int weight,boolean isPoisonous) {
        super(name, age, weight);
        this.isPoisonous = isPoisonous;
    }

    @Override
    public void move() {
        System.out.println("Snake crawls");
    }
}
