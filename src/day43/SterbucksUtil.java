package day43;

public class SterbucksUtil {

    public static void main(String[] args) {

        Coffee c = new Coffee("Blonde", 5, 1.6 );
        printCoffeeInfo(c);

        String myStr = new String("Hello");
        printStringInfo(myStr);
    }

    //Create a static method to accept a coffee object and print it is infarmation
    public static void printCoffeeInfo(Coffee co){

        System.out.println("Coffe name: " +co.getType() );
        System.out.println("Price is: "+ co.getPrice());
        System.out.println("Level of coffee: "+ co.getCaffeineLevel());

    }

    public static void printStringInfo(String str){
        System.out.println("first: "+ str.charAt(0));
        System.out.println("Last: "+ str.charAt(str.length()-1));
    }
}
