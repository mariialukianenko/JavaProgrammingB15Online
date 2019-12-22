package day21;

public class SkipAll5s {
    public static void main(String[] args) {

        int count = 1;
        for (int i = 1; i <=100 ; i++) {
            if(i%5==0){
                continue;
            }
            System.out.println(count+" = "+ i);
            count++;
        }

        //// without continue statement
        System.out.println("---------");
        for (int x = 1; x <= 100 ; x++) {
            if (x%5 != 0){
                System.out.println(x);
            }else{
                System.out.println("skipping "+ x);
            }

        }

    }
}
