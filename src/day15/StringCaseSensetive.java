package day15;

public class StringCaseSensetive {
    public static void main(String[] args) {

        String name = "Arya Stark";
        System.out.println( name.contains("st") );

        String upperCaseName = name.toUpperCase();
        System.out.println("contains ST? " + upperCaseName.contains("ST"));

        String lowerCaseName = name.toLowerCase();
        System.out.println("contains st? " + lowerCaseName.contains("st"));

        // this is called method chaining, combining multiple method call
        System.out.println(name.toLowerCase().contains("st"));



    }
}
