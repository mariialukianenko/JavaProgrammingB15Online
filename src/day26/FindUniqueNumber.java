package day26;

import javax.swing.plaf.IconUIResource;

public class FindUniqueNumber {
    public static void main(String[] args) {

        char [] letter = {'a', 'b', 'c', 'a', 'b'};

        //find unique letter

        int count = 0;
        for (int x = 0; x <= letter.length-1 ; x++) {
            for (int y = 0; y <= letter.length-1 ; y++) {
                if (letter[x] == letter[y]) {
                    count++;
                }
            }
                if (count < 2){
                System.out.println(letter[x]);
            }
            count=0;
        }


        System.out.println("=========================");

        int [] numbers = {1, 2, 3, 1, 2, 5, 3};

        int countNumber = 0;

        for (int i = 0; i <= numbers.length-1 ; i++) {
            for (int j = 0; j <= numbers.length-1 ; j++) {
                if (numbers[i] == numbers[j]){
                    countNumber++;
                }
            }
            if (countNumber==1){
                System.out.println(numbers[i]);
                break;
            }
            countNumber=0;
        }
    }
}
