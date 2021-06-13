package javaCore.lesson3.myclass;
import javaCore.lesson3.myclass.Car.Color;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", LocalDate.of(2015,4,20), Color.Black,15,250);
        Car audi = new Car("Audi",LocalDate.of(2015,3,18), Color.White,16,230);
        bmw.move();
        audi.move();

    }
}
