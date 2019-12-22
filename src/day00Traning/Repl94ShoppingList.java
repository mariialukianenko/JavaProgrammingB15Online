package day00Traning;
import java.util.Scanner;
public class Repl94ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalProce = 0;

        do{
            System.out.println("Enter Item"+count+" and its price:");
            item = scan.next();
            price = scan.nextDouble();
            System.out.println("Add one more item?");
            countinue = scan.next();
            if (countinue.equalsIgnoreCase("yes") && count <= 10){
                shoppingListReport = shoppingListReport + "Item" +count + ": "+item+
                        " Price: " + price+", ";
            } else{
                shoppingListReport = shoppingListReport + "Item" +count + ": "+item+
                        " Price: " + price;
            }

            totalProce = totalProce + price;
            count++;

        } while (countinue.equalsIgnoreCase("yes") && count <= 10);
        System.out.println(shoppingListReport);
        System.out.println("Total price: "+totalProce);

    }
}

