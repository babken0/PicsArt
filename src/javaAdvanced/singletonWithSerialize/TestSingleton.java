package javaAdvanced.singletonWithSerialize;

import java.io.*;

public class TestSingleton {
    public static <ObjectInput> void main(String[] args)
    {
        try
        {
            Singleton instance1 = Singleton.getInstance();
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();


            ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.text"));
            Singleton instance2 = (Singleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
