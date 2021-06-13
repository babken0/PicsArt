package javaAdvanced.XMLserialization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static final String FILE_NAME = "humans.xml";
    public static void main(String[] args) {
        Human human1 = new Human("Karen","Ghazaryan",22);
        Human human2 = new Human("Marine","Avetisyan",35);
        Human human3 = new Human("Grigor","Ayvazyan",39);
        List<Human> humans = new ArrayList<>();
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);

        try(XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(FILE_NAME)))) {
            xmlEncoder.writeObject(humans);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }





    }
}
