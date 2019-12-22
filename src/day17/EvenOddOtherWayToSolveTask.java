package day17;

public class EvenOddOtherWayToSolveTask {
    public static void main(String[] args) {

        int cnt3 = 0;



        while (cnt3 <= 50){
            if (cnt3 %2 == 0){
                System.out.println(cnt3+" is even number.");
            }else {
                System.out.println(cnt3+" is odd number.");
            }
            ++cnt3;

        }

    }
}
