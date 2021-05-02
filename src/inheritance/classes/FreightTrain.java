package inheritance.classes;

import inheritance.abstaractClasses.Train;
import inheritance.interfaces.Cargo;

public class FreightTrain extends Train implements Cargo {
    public FreightTrain(String firmName, int weight, int publishedYear, int maxSpeed) {
        super(firmName, weight, publishedYear, maxSpeed);
    }

    @Override
    public void moveProduct(String from, String to, int productWeight) {
        System.out.println("Train transport "+ productWeight + "KG from " + from + " to " + to);
    }


}
