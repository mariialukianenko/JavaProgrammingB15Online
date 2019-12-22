package day12;

public class FizzNumberTask3 {
    public static void main(String[] args) {

        int number =25;
        if (number%3==0 && number%5==0)
            System.out.println("FizzBuzz number");
        else if (number%5==0)
            System.out.println("Fizz number");
        else if (number%3==0)
            System.out.println("Buzz number");
          else
            System.out.println("Not my number.");
    }
}
