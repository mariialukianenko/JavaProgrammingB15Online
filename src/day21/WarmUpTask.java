package day21;

public class WarmUpTask {
    public static void main(String[] args) {

        String myName = "Mariia";

        for (char i = 0; i <= myName.length()-1; i++) {
            System.out.print(myName.charAt(i) + "-->");
        }
        System.out.println();
        for (int y = 0; y <= myName.length() - 2; y++) {
            System.out.println(myName.substring(y, y + 2));
        }
        System.out.println();
        for (int x = 0; x <= myName.length() - 2; x=x+2) {
            System.out.println(myName.substring(x,x+2));
        }
        System.out.println();
        for (int x = 0; x <= myName.length() - 2; x=x+3) {
            System.out.println(myName.substring(x,x+3));
        }
        System.out.println();
        for (int x = 0; x <= myName.length() - 3; x=x+1) {
            System.out.println(myName.substring(x,x+3));
        }
    }
}