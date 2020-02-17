package day58;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {
    public static void main(String[] args) {
        System.out.println("Before try catch");

        try {
            Files.readAllLines(Paths.get("file.txt"));
        }catch (IOException e){
            System.out.println("Exception happened and caugh");
        }

        System.out.println("After try catch");
    }
}
