package day32;

import org.w3c.dom.ls.LSOutput;

public class AlphabeticalPrint {

    public static void main(String[] args) {

        printAtoZ();
        printAtoZ();
        ptintAlphabetInRange('D', 'A');

    }

    public static void ptintAlphabetInRange( char beginning, char ending){
        if (beginning < ending){
            System.out.println("Increment");
            for (char iChar = beginning; iChar <= ending ; iChar++) {
                System.out.print(iChar+" ");
            }
            System.out.println();
        }else if (beginning > ending){
            System.out.println("Decrement");
            for (char iChar = beginning; iChar >= ending ; iChar--) {
                System.out.print(iChar+" ");
            }
            System.out.println();
        }else{
            System.out.println("They are same.");
        }
    }

    public static void printAtoZ(){
        for (char iChar = 'A'; iChar <= 'Z' ; iChar++) {
            System.out.print(iChar+" ");
        }
        System.out.println();
    }

}
