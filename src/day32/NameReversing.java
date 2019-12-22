package day32;

public class NameReversing {

    public static void main(String[] args) {

        reverseMyOwnName();
        printStringWithDashBeetwen("Illia");
        System.out.println();

        String name = "Masha";
        for (int x = 0; x <=name.length()-1 ; x++) {
            System.out.print(name.charAt(x));
            if (x != name.length()-1) {
                System.out.print("-");
            }
        }
    }


    public static void printStringWithDashBeetwen (String anyName){
        for (int x = 0; x <=anyName.length()-1 ; x++) {
            System.out.print(anyName.charAt(x));
            if (x != anyName.length()-1) {
                System.out.print("-");
            }
        }


    }




    public static void reverseMyOwnName(){

        String myName = "Mariia";
        for (int i = myName.length()-1; i >=0  ; i--) {
            System.out.print(myName.charAt(i));
        }

        System.out.println();
    }
}
