package javaCore.inheritance.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileService {
    public static List<String> readFile(String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }

    public static void writeFile(String path,String string) throws IOException {
        Files.write(Paths.get(path),string.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
    }


    public static void createFile(String fileName) throws IOException {
        Files.createFile(Paths.get("C:\\Users\\babke\\IdeaProjects\\PicsArt\\src\\javaCore.inheritance\\files" + File.separator + fileName));
    }
}
