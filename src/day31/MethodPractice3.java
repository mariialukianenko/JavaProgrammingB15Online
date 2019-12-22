package day31;

public class MethodPractice3 {

    // create a method countDownFrom20
    // create a method to print odd numbers from 1-100 : printOddNumbers1to100
    // Create a method to spell your name: M a r i i a
    public static void main(String[] args) {

        printOddNumbers1to100();
        System.out.println();
        countDownFrom20();
        System.out.println();
        spellName();
    }

    public static void printOddNumbers1to100(){

        for (int i = 1; i <= 100 ; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }

    public static void countDownFrom20(){
        for (int x = 20; x >= 0 ; x--) {
            System.out.print(x+" ");
        }
    }
    public static void spellName(){
        String name = "Mariia";
        for (int y = 0; y <=name.length()-2 ; y++) {
            System.out.print(name.charAt(y)+"-");
        }
        System.out.print(name.charAt(name.length()-1));
    }


}
