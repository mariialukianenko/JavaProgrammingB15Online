package day34;

public class ReturnPractice {

    public static void main(String[] args) {

        // break VS return
        // break --> loop: break out of the loop
              // --> switch: break out of the case
        // return --> inside the method
              // return the value out of a method with return type
              // with void method: < return; >   and stop!

        printMin4CharacterLengthName("Masha");
        printMin4CharacterLengthName("Po");
    }

    public static void printMin4CharacterLengthName(String name){
        // if the name less than 4 cahrs, get out of the method
        if (name.length()<4){
            System.out.println("Invalid name");
            return;
        }
        System.out.println(name);
    }

}
