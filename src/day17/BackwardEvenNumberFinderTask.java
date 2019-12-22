package day17;

public class BackwardEvenNumberFinderTask {
    public static void main(String[] args) {

        int count = 100;
        while (count >= 0){

            if (count%2 == 0){
                System.out.println(count + " even number");
            }
            --count;

        }
    }

}
