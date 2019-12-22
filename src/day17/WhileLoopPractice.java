package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {
        // count from 1 to 5 than 5 to 1
        int counter = 1;
        while (counter <= 5){
            System.out.print(counter + " ");
            ++counter;
        }
        System.out.println();
        System.out.println("counter after increment = " + counter);
        // now I want to count from 5 to 1
        while (counter > 1){
            --counter;
            System.out.print(counter+" ");
        }
        System.out.println();
        System.out.print("counter after decrement = " + counter);
    }
}

