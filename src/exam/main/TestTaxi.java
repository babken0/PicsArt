package exam.main;

import exam.model.Taxi;
import exam.service.TaxiService;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TestTaxi {
    public static void main(String[] args) {
        TaxiService taxiService = new TaxiService();
        Taxi [] taxis = new Taxi[4];
        taxis[0] = taxiService.createTaxi();
        taxis[1] = taxiService.createTaxi();
        taxis[2] = taxiService.createTaxi();
        taxis[3] = taxiService.createTaxi();
        boolean isMenuActive = true;
        Scanner scanner = new Scanner(System.in);
        while (isMenuActive){
            System.out.println("Task1: 1");
            System.out.println("Task2: 2");
            System.out.println("Task3: 3");
            System.out.println("Task4: 4");
            System.out.println("Task5: 5");
            System.out.println("Task6: 6");
            System.out.println("Task7: 7");
            System.out.println("Task8: 8");
            System.out.println("Exit: 0");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    taxiService.printCostAndSpeed(taxiService.createTaxi());
                    break;
                case 2:
                    taxiService.newer(taxiService.createTaxi(),taxiService.createTaxi());
                    break;
                case 3:
                    taxiService.smallestSeatsCount(taxiService.createTaxi(),taxiService.createTaxi(),taxiService.createTaxi());
                    break;
                case 4:
                    taxiService.printNotSportTaxis(taxis);
                    break;
                case 5:
                    taxiService.more50000mileage(taxis);
                    break;
                case 6:
                    taxiService.minWeight(taxis);
                    break;
                case 7:
                    taxiService.minSportTaxiCost(taxis);
                    break;
                case 8:
                    taxiService.orderByYear(taxis);
                    break;
                case 0:
                    isMenuActive = false;
                default:
                    System.out.println("Input from 0- 8");

            }

        }

    }


}
