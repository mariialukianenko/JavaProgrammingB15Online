package day31;

public class OneMethodInsideAnother {
    public static void main(String[] args) {

         finallyAwake();

    }

    public static void finallyAwake(){
        wakeUp();
        drinkCoffe();
    }


    public static void wakeUp(){
        System.out.println("Open your eye.");
        System.out.println("Alarm.");
        System.out.println();
    }

    public static void drinkCoffe(){
        System.out.println("Make delicious decaf coffee.");
        System.out.println("Latte with one pump of hazelnuts.");
        System.out.println();
    }


}
