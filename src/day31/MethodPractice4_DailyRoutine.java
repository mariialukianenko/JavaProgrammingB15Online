package day31;

public class MethodPractice4_DailyRoutine {

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

    public static void prepareLunchForIllia (){
        System.out.println("Prepare box lunch for Illia.");
        System.out.println("Prepare with love.");
        System.out.println();
    }
    public static void groceryShopping(){
        System.out.println("Go to the Trader Joy, Whole Foods and L&B.");
        System.out.println("Buy clean and healthy food.");
        System.out.println();
    }

    public  static void studyJava(){
        System.out.println("Think about Java all day.");
        System.out.println("Code Java.");
        System.out.println("Practice and practice.");
        System.out.println();
    }

    public static void sayILoveJava300Times(){
        for (int i = 1; i <=20 ; i++) {
            System.out.print("I love Java | ");
        }
    }

    public static void main(String[] args) {
        wakeUp();
        drinkCoffe();
        prepareLunchForIllia();
        groceryShopping();
        studyJava();
        sayILoveJava300Times();
        /*
       wakeUp
       drinkCoffe
       prepareLunchForIllia
       groceryShopping
       cooking
       studyJava
       goToSleep
         */
    }

}
