package javaCore.inheritance.service;
import javaCore.inheritance.Convector;
import javaCore.inheritance.classes.Truck;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TruckService {
    public static Truck createTruck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input track firm name");
        String firmName = scanner.next();
        System.out.println("Input track weight");
        int weight = scanner.nextInt();
        System.out.println("Input track published year");
        int year = scanner.nextInt();
        System.out.println("Input track max speed");
        int maxSpeed = scanner.nextInt();
        System.out.println("Input track max cargo weight");
        int maxCargoWeight = scanner.nextInt();
        System.out.println("Input track wheel count");
        int wheelCount = scanner.nextInt();
        System.out.println("Is track sport(y/n)");
        boolean sport = scanner.next().charAt(0) == 'y';

        Truck truck = new Truck(firmName,weight,year,maxSpeed);
        truck.setMaxCargoWeight(maxCargoWeight);
        truck.setIsSport(sport);
        truck.setWheelCount(wheelCount);
        return truck;
    }
    public static List<Truck> readTrucks(String path) throws IOException {
        return Convector.convertTruck(FileService.readFile(path));
    }
    public static void writeTruck(Truck truck, String path) throws IOException {
        String truckString = truck.getFirmName()+","+truck.getWeight()+","+truck.getPublishedYear()+
                "," + truck.getMaxSpeed() + ","+ (truck.getIsSport() ?"sport,":"not sport,") +
                truck.getWheelCount()+ "," + truck.getMaxCargoWeight()+"\n";
        FileService.writeFile(path,truckString);
    }
    // print max cargo weight truck
    public static void printMaxCargoWeightTruck(List<Truck> trucks){
        Truck max = trucks.get(0);
        for(Truck truck: trucks){
            if (truck.getMaxCargoWeight() > max.getMaxCargoWeight()){
                max = truck;
            }
        }
        System.out.println(max);
    }

    // print truck by published year
    public static void printTruckByYear(List<Truck> trucks){
        for (int i = 0; i <trucks.size(); i++) {
            for (int j = 0; j < trucks.size()-1-i;  j++) {
                if (trucks.get(i).getPublishedYear()< trucks.get(i + 1).getPublishedYear()){
                    Truck c = trucks.get(i);
                    trucks.set(i, trucks.get(i + 1));
                    trucks.set(i + 1, c);
                }
            }
            System.out.println(trucks.get(trucks.size() - 1 - i));
        }
    }




}
