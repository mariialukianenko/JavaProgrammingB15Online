package day14;

public class IndexOfPractice {
    public static void main(String[] args) {

        //indexOf = find out index of another String inside this string
        String name = "Game of Java";

        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("o"));

        System.out.println(name.indexOf(" "));

        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf(" "));
        System.out.println(name.lastIndexOf("Ga"));
        System.out.println(name.lastIndexOf("Kawa"));

        //if i do not use content method, what would be my condition to check
        if (name.indexOf("Kava") > -1){
            System.out.println("Kawa found");
        }else{
            System.out.println("No kawa");
        }

    }
}
