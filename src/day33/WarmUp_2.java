package day33;

public class WarmUp_2 {

    public static void main(String[] args) {



        System.out.println(getSpelledName("Masha"));
    }

    public static String getSpelledName(String name){

       String result = "";
        for (int x = 0; x <= name.length()-2 ; x++) {

                result = result + name.charAt(x)+"-";
            }
        result = result + name.charAt(name.length()-1);

        return result;
        // return result + name.charAt(name.length()-1);
    }

}
