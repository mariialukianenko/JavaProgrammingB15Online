package day19;

public class CharAndForLoop {
    public static void main(String[] args) {

        // ASCII value from ascii table

       // int x = 'A';
        char myChar = 'A';
        System.out.println(myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println('Z' > 'B');

        for ( char iChar = 'A'; iChar <= 'Z' ; iChar++ ){
            System.out.print(iChar+" ");
        }

        System.out.println();
        for ( char iChar = 'Z'; iChar >= 'A' ; iChar-- ){
            System.out.print(iChar+" ");
        }

    }
}
