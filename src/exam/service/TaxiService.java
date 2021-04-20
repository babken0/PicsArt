package exam.service;

import exam.model.Taxi;

import java.util.Scanner;

public class TaxiService {

    //Task1
    public void printCostAndSpeed(Taxi taxi){
        if (taxi.isSport()){
            System.out.println("Cost:" + taxi.getCost() + " Top speed: " + taxi.getTopSpeed());
        }
        else{
            System.out.println("Model: "+ taxi.getModel()+ " Country: "+ taxi.getCountry());
        }
    }
    //Task2
    public Taxi newer(Taxi taxi1, Taxi taxi2){
        if (taxi2.getYear()  < taxi1.getYear()){
            return taxi2;
        }
        else{
            return taxi1;
        }
    }

    //Task3
    public Taxi smallestSeatsCount(Taxi taxi1, Taxi taxi2, Taxi taxi3){
        if (taxi1.getSeats() <= taxi2.getSeats() && taxi1.getSeats() <= taxi3.getSeats()){
            return taxi1;
        }
        else if (taxi2.getSeats() < taxi1.getSeats() && taxi2.getSeats() < taxi3.getSeats()){
            return taxi2;
        }
        else {
            return taxi3;
        }
    }
    //Task4
    public void printNotSportTaxis(Taxi[] taxis){
        for (Taxi taxi:taxis) {
            if (!taxi.isSport()){
                System.out.println(taxi);
            }
        }
    }

    //Task5
    public void more50000mileage(Taxi[] taxis){
        for (Taxi taxi: taxis) {
            if (taxi.getMileage() > 50000){
                System.out.println(taxi);
            }
        }
    }

    //Task6
    public Taxi minWeight(Taxi[] taxis){
        Taxi minTaxi = taxis[0];
        for (int i = 1; i < taxis.length; i++) {
            if (taxis[i].getWeight() <= minTaxi.getWeight()){
                minTaxi = taxis[i];
            }
            }
        return minTaxi;
    }

    //Task7
    public Taxi minSportTaxiCost(Taxi[] taxis){
        Taxi minCostTaxi = null;
        int first = 0;
        for (int i = 0; i < taxis.length; i++) {
            if (taxis[i].isSport()){
                minCostTaxi = taxis[i];
                first = i;
                break;
            }
        }
        for (int i = first+ 1; i < taxis.length; i++) {
            if (taxis[i].getCost() > minCostTaxi.getCost()){
                minCostTaxi = taxis[i];
            }
        }
        return minCostTaxi;
    }

    //Task8
    public void orderByYear(Taxi[] taxis){
        for (int i = 0; i < taxis.length; i++) {
            for (int j = 0; j < taxis.length-i-1; j++) {
                if (taxis[j].getYear() > taxis[j+1].getYear()){
                    Taxi c = taxis[j];
                    taxis[j]= taxis[j+1];
                    taxis[j+1] = c;
                }
                System.out.println(taxis[taxis.length-i-1]);
            }
        }
    }

    //Create Taxi
    public Taxi createTaxi(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input taxi model");
        String model = scanner.next();
        if (model.equals("")){
            model = "BMW";
        }
        System.out.println("Input country");
        String country = scanner.next();
        if (country.equals("")){
            country = "Germany";
        }
        System.out.println("Input year of publishing  (from 1903 to 2020)");
        int year = scanner.nextInt();
        if (year < 1903 || year > 2020){
            System.out.println("Please input right year");
            year = scanner.nextInt();
        }

        System.out.println("Input mileage (from 0 to 999999)");
        int mileage = scanner.nextInt();
        if (mileage < 0 || mileage > 999999){
            System.out.println("Please input from 0 to 999999");
            mileage = scanner.nextInt();
        }

        System.out.println("Is sport car y/n");
        boolean sport = scanner.next().charAt(0) == 'y';

        System.out.println("Input weight (from 1000 KG to 3000 KG)");
        int weight = scanner.nextInt();
        if (weight < 1000 || weight > 3000){
            System.out.println("Please input right weight");
            weight = scanner.nextInt();
        }

        System.out.println("Input Max speed");
        int speed = scanner.nextInt();
        if (speed < 0){
            System.out.println("Please input not negative value");
            speed = scanner.nextInt();
        }

        System.out.println("Input seat count");
        int seat = scanner.nextInt();
        if (seat < 0){
            System.out.println("Please input not negative value");
            speed = scanner.nextInt();
        }
        System.out.println("Input car cost");
        int cost = scanner.nextInt();
        if (cost < 0){
            System.out.println("Please input not negative value");
            cost = scanner.nextInt();
        }

        Taxi taxi = new Taxi(model,country,year,cost);
        taxi.setMileage(mileage);
        taxi.setSport(sport);
        taxi.setTopSpeed(speed);
        taxi.setWeight(weight);
        return taxi;
    }

}
