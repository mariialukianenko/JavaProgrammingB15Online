package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {

        String name = "Mariia";


        for (int x = 0; x <= name.length()-2; x++){
            System.out.println(name.substring(x, x+2));
        }

        System.out.println("Got 3 character");
        for (int y = 0; y <= name.length()-3; y++){
            System.out.println(name.substring(y,y+3));
        }

    }
}
