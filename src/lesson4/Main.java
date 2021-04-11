package lesson4;

public class Main {
    public static void main(String[] args) {
        Snake snake = new Snake("Anaconda",3,4,true);
        snake.move();
        System.out.println(snake.getAge());
        Fish fish = new Fish("WithFish",1 ,2,10);
        fish.move();
    }

}
