package day00Traning;
import java.util.Arrays;
import java.util.Scanner;
public class Repl119SplitEmail {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String email = input.nextLine();

            String [] arrOfemail = email.split("@");

            int count = 0;
        for (int i = 0; i <=email.length()-1 ; i++) {
            if (email.substring(i, i+1).contains("@")) {
                count = count + 1;
            }

        }

            if (!email.contains("@")   ||  count>=2  ){
                System.out.println("invalid email");
            }else {
                    System.out.println("Email id: "+ arrOfemail[0]);
                    System.out.println("Email domain: "+arrOfemail[1]);
            }




    }
}
