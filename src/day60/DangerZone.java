package day60;

// STATIC we can call directly

import java.io.FileNotFoundException;

public class DangerZone {
    // Handle or Declare are the way to deal with checked exception
    // if you are sure the method will never actually throw the exception
    // it's good to just declare it to go through compiler to make it happy
    // if there is actually a chance for the exception might left unhandled
    // it's good to wrap up under try catch

    public static void main(String[] args) throws InterruptedException { //FileNotFoundException, InterruptedException {

        System.out.println("The start");
        try {
            readMyFile();
        } catch (FileNotFoundException e) {
            System.out.println("Handling here. Moving on.");
        }
        // thread class coming from java.land package (JDK)
        Thread.sleep(3000);
        System.out.println("The end");

    }
    // document this method to tell the caller , the file you are about to read might not exists
    // and handle the consequences yourself
    // the exception type already exists for this type of situation is called
    // FileNotFoundException from java.util package

    public static void readMyFile() throws FileNotFoundException {

        System.out.println("Reading the file in my computer");
        throw new FileNotFoundException("Kaboom! File is not here.");

    }


}
