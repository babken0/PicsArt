package javaCore.inheritance.service;


import javaCore.inheritance.classes.Bus;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static javaCore.inheritance.Convector.*;

public class BusService {


    public static Bus createBus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input bus firm name");
        String firmName = scanner.next();
        System.out.println("Input bus weight");
        int weight = scanner.nextInt();
        System.out.println("Input bus published year");
        int year = scanner.nextInt();
        System.out.println("Input bus max speed");
        int maxSpeed = scanner.nextInt();
        System.out.println("Input bus seat count");
        int seatCount = scanner.nextInt();
        System.out.println("Input bus wheel count");
        int wheelCount = scanner.nextInt();
        System.out.println("Is bus sport(y/n)");
        boolean sport = scanner.next().charAt(0) == 'y';

        Bus bus = new Bus(firmName, weight, year, maxSpeed);
        bus.setSeatCount(seatCount);
        bus.setWheelCount(wheelCount);
        bus.setIsSport(sport);
        return bus;
    }
    public static List<Bus> readBuses(String path) throws IOException {
        return convertBus(FileService.readFile(path));
    }

    public static void writeBus(Bus bus,String path) throws IOException {
        String busString = bus.getFirmName()+","+bus.getWeight()+","+bus.getPublishedYear()+
                "," + bus.getMaxSpeed() + ","+ (bus.getIsSport() ?"sport,":"not sport,") +
                bus.getWheelCount()+ "," + bus.getSeatCount();
        FileService.writeFile(path,busString );
    }

    public static void printMaxSeatCountBus(List<Bus> buses) {
        Bus max = buses.get(0);
        for (Bus bus : buses) {
            if (bus.getSeatCount() > max.getSeatCount()) {
                max = bus;
            }
        }
        System.out.println(max);
    }

    public static void printBusBySeatCount(List<Bus> buses) {
        for (int i = 0; i < buses.size(); i++) {
            for (int j = 0; j < buses.size() - 1 - i; j++) {
                if (buses.get(i).getPublishedYear() < buses.get(i + 1).getPublishedYear()) {
                    Bus c = buses.get(i);
                    buses.set(i, buses.get(i + 1));
                    buses.set(i + 1, c);
                }
            }
            System.out.println(buses.get(buses.size() - 1 - i));
        }
    }

}
