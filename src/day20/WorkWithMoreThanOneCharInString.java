package day20;

public class WorkWithMoreThanOneCharInString {
    public static void main(String[] args) {

        String name = "Gokyuzum";
        int charCount = name.length();
        System.out.println(charCount);

        System.out.println(name.substring(0,2));
        System.out.println(name.substring(2,4));
        System.out.println(name.substring(4,6));
        System.out.println(name.substring(6,8));
        System.out.println("-------------");


//        int x = 0;
//        System.out.println(name.substring(x, x + 2));
//        x = x +2;
//        System.out.println(name.substring(x, x + 2));
//        x = x +2;
//        System.out.println(name.substring(x, x + 2));
//        x = x +2;
//        System.out.println(name.substring(x, x + 2));

        System.out.println("------------");

        //int lastCharIndex = name.length()-1;
        for (int x = 0; x<=name.length()-2; x+=2){
            System.out.println(name.substring(x,x+2));
        }

    }
}
