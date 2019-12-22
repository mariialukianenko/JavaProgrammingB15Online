package day24;

public class WarmUpTask {
    public static void main(String[] args) {

        String[] item = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi", };
        float [] prices = { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };


        // in one line
        for ( String grocery : item  ){
            System.out.print(grocery);
            if (!grocery.equals(item[item.length-1])){
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("------------");

        // print item with odd index
        for ( String grocery : item  ){
            if ( grocery.length()%2 != 0 ){
                System.out.print(grocery+" ");
            }
        }




    }
}
