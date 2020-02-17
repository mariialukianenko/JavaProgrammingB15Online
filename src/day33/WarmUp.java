package day33;

public class WarmUp {

    public static void main(String[] args) {

       String spelledName =  getSpelledName("Marria");
        System.out.println("spelledName = " + spelledName);

        System.out.println(getSpelledName("Illia"));
    }

    public static String getSpelledName(String name){

       String result = "";
        for (int x = 0; x <= name.length()-1 ; x++) {

                result = result + name.charAt(x);
            if (x != name.length()-1 ){
                result = result+"-";
            }

        }

        return result;
    }

}
