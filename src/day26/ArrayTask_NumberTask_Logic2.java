package day26;

public class ArrayTask_NumberTask_Logic2 {
    public static void main(String[] args) {
        int [] scores = {156, 101, 76, 187, 87, 110};


        String finalResult = "YES";
        
        for (int  eachNum   :    scores ) {
            if (eachNum <= 100){
                finalResult = "NO";
                break;
            }
        }
        System.out.println("finalResult = " + finalResult);
    }
}
