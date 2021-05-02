package inheritance;


import inheritance.classes.Bus;
import inheritance.classes.FreightTrain;
import inheritance.classes.Truck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convector {
    public static List<Truck> convertTruck(List<String> list) {
        List<Truck> trucks = new ArrayList<>();
        for(String truckString:list){
            List<String> param = Arrays.asList(truckString.split(","));
            Truck truck= new Truck(param.get(0),Integer.parseInt(param.get(1)),Integer.parseInt(param.get(2)),Integer.parseInt(param.get(3)));
            truck.setIsSport(param.get(4).equals("sport"));
            truck.setWheelCount(Integer.parseInt(param.get(5)));
            truck.setMaxCargoWeight(Integer.parseInt(param.get(6)));
            trucks.add(truck);
        }
        return trucks;
    }


    public static List<Bus> convertBus(List<String> list) {
        List<Bus> buses = new ArrayList<>();
        for(String busString:list){
            List<String> param = Arrays.asList(busString.split(","));
            Bus bus= new Bus(param.get(0),Integer.parseInt(param.get(1)),Integer.parseInt(param.get(2)),Integer.parseInt(param.get(3)));
            bus.setIsSport(param.get(4).equals("sport"));
            bus.setWheelCount(Integer.parseInt(param.get(5)));
            bus.setSeatCount(Integer.parseInt(param.get(6)));
            buses.add(bus);
        }
        return buses;
    }

    public static List<FreightTrain> convertFreightTrain(List<String> list) {
        List<FreightTrain> trains = new ArrayList<>();
        for(String trainString:list){
            List<String> param = Arrays.asList(trainString.split(","));
            FreightTrain train= new FreightTrain(param.get(0),Integer.parseInt(param.get(1)),Integer.parseInt(param.get(2)),Integer.parseInt(param.get(3)));
            trains.add(train);
        }
        return trains;
    }
}
