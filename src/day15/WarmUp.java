package day15;

public class WarmUp {
    public static void main(String[] args) {

        String name = "Mariia";
        if(name.length()<4)
            System.out.println("Short name");
        else if (name.length()>=4 && name.length()<=10)
            System.out.println("Medium name");
        else if (name.length()>=11)
            System.out.println("Longer name");

        System.out.println();
        if (name.contains("a") || name.contains("e"))
            System.out.println("Name contains a or e");
        else
            System.out.println("I don't have both");

    }
}
