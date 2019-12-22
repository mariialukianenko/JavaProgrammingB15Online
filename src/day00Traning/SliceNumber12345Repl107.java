package day00Traning;

public class SliceNumber12345Repl107 {
    public static void main(String[] args) {

        int num = 12345;
        String newNumber = "";

        while (num>=1){
            int oneNumber = num%10;
            newNumber = newNumber+oneNumber;
            num = num/10;
        }


        System.out.println(newNumber);
        for (int x=  newNumber.length()-1; x>=0 ; x--) {
            System.out.print(newNumber.charAt(x));
        }
    }
}
