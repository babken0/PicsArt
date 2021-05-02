package inheritance.service;

import inheritance.Convector;
import inheritance.classes.Bus;
import inheritance.classes.FreightTrain;
import inheritance.classes.Truck;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FreightTrainService {
    public static FreightTrain createFreightTrain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input train firm name");
        String firmName = scanner.next();
        System.out.println("Input train weight");
        int weight = scanner.nextInt();
        System.out.println("Input train published year");
        int year = scanner.nextInt();
        System.out.println("Input train max speed");
        int maxSpeed = scanner.nextInt();
        System.out.println("Input train carriage count");
        int carriageCount = scanner.nextInt();
       FreightTrain train = new FreightTrain(firmName,weight,year,maxSpeed);
       train.setCarriageCount(carriageCount);
       return train;
    }


    public static List<FreightTrain> readFreightTrain(String path) throws IOException {
        return Convector.convertFreightTrain(FileService.readFile(path));
    }

    public static void writeTrain(FreightTrain freightTrain, String path) throws IOException {
        String trainString = freightTrain.getFirmName()+","+freightTrain.getWeight()+","+freightTrain.getPublishedYear()+
                "," + freightTrain.getMaxSpeed() + ",";
        FileService.writeFile(path,trainString );
    }



}
