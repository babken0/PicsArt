package inheritance;

import inheritance.service.BusService;
import inheritance.service.FileService;
import inheritance.service.FreightTrainService;
import inheritance.service.TruckService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;



public class Menu {
    public static final String BUS_PATH = "C:\\Users\\babke\\IdeaProjects\\PicsArt\\src\\inheritance\\files\\buses.txt";
    public static final String TRAIN_PATH = "C:\\Users\\babke\\IdeaProjects\\PicsArt\\src\\inheritance\\files\\trains.txt";
    public static final String TRUCK_PATH = "C:\\Users\\babke\\IdeaProjects\\PicsArt\\src\\inheritance\\files\\trucks.txt";

    public static void main(String[] args) throws IOException {
        if (!Files.exists(Paths.get(BUS_PATH)))
            FileService.createFile("buses.txt");
        if (!Files.exists(Paths.get(TRAIN_PATH)))
            FileService.createFile("trains.txt");
        if (!Files.exists(Paths.get(TRUCK_PATH)))
            FileService.createFile("trucks.txt");
        boolean isMenuActive = true;
        Scanner scanner = new Scanner(System.in);
        while (isMenuActive) {
            System.out.println("Print Max Seat Count Bus: 1");
            System.out.println("print Bus By Seat Count: 2");
            System.out.println("print max Cargo Weight Truck");
            System.out.println("print Truck By Year: 4");
            System.out.println("Write bus in file: 5");
            System.out.println("Write truck in file: 6");
            System.out.println("Write freight train in file: 7");
            System.out.println("Read all buses: 8");
            System.out.println("Read all trucks: 9");
            System.out.println("Read all freight trains: 10");
            System.out.println("Exit: 0");


            switch (scanner.nextInt()) {
                case 1:
                    BusService.printMaxSeatCountBus(BusService.readBuses(BUS_PATH));
                    break;
                case 2:
                    BusService.printBusBySeatCount(BusService.readBuses(BUS_PATH));
                    break;
                case 3:
                    TruckService.printMaxCargoWeightTruck(TruckService.readTrucks(TRUCK_PATH));
                    break;
                case 4:
                    TruckService.printTruckByYear(TruckService.readTrucks(TRUCK_PATH));
                    break;
                case 5:
                    BusService.writeBus(BusService.createBus(),BUS_PATH);
                    break;
                case 6:
                    TruckService.writeTruck(TruckService.createTruck(),TRUCK_PATH);
                    break;
                case 7:
                    FreightTrainService.writeTrain(FreightTrainService.createFreightTrain(),TRUCK_PATH);
                    break;
                case 8:
                    System.out.println(BusService.readBuses(BUS_PATH));
                    break;
                case 9:
                    System.out.println(TruckService.readTrucks(TRUCK_PATH));
                    break;
                case 10:
                    System.out.println(FreightTrainService.readFreightTrain(TRAIN_PATH));
                case 0:
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("wrong input");

            }
        }
    }
}
