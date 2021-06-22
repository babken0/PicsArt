package javaAdvanced.folderSize;

import java.io.File;
import java.util.LinkedList;
import java.util.Objects;

public class Size {

    static LinkedList<Long> list = new LinkedList<>();


    private static long getSize(File file) {

        long  size=0;
        if (file.isFile()) {
            size = file.length();
        } else {
            for (File f : Objects.requireNonNull(file.listFiles())) {
                if (f.isDirectory()) {
                    size += getSize(f);
                } else {
                    size+= f.length();
                   list.add(f.length());
                }

            }


        }
        return size;
    }

    public static long sum(File file){
        long sum =0;
        getSize(new File("C:\\Users\\babke\\IdeaProjects"));
        for (long i : list){
            sum+= i;
            System.out.println(sum);
        }
        return sum;
    }

}
