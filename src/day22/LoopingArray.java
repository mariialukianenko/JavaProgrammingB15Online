package day22;

public class LoopingArray {
    public static void main(String[] args) {

        int [] score = new int[4];
        score[0] = 95;
        score[1] = 70;
        score[2] = 88;
        score[3] = 100;


      //  int itemCount = score.length;
        for (int x = 0; x <=score.length-1 ; x++) {
            System.out.println(score[x]);


        }

        System.out.println("---------------");
        for (int x = score.length-1; x>=0 ; x--) {
            System.out.println(score[x]);
        }
//        String name = "Jon Snow";
//        int charCount = name.length();


    }
}
