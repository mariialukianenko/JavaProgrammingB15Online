package day10;

public class Answer {
    public static void main(String[] args) {

        String myAnswer = "";

        double myNumber = 30;

        if (myNumber%5==0)
            myAnswer = "Fizz number";
        else
            myAnswer = "Not a fizz number";

        System.out.println("My number "+myNumber + " it is "+myAnswer);

    }
}
