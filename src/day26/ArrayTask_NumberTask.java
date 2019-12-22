package day26;

public class ArrayTask_NumberTask {
    public static void main(String[] args) {
        int [] scores = {156, 101, 76, 187, 87, 110};

        // create the variable called finalResult to store your result of cheking
        // if every number in this array is more than 100 or not
        String finalResult = "";   //  yes or no

        int count = 0;
        for (int  eachNum   :    scores ) {
            if (eachNum < 100){
                count++;
            }
        }
        System.out.println("count = " + count);
        if( count>0){
            finalResult = "NO";
        }else{
            finalResult = "YES";
        }
        System.out.println("finalResult = " + finalResult);


        
    }
}
