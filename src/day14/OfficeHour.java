package day14;

public class OfficeHour {
    public static void main(String[] args) {

        String mainOption = "Food";
        String secondaryOption = "Snack";

        if (mainOption.equalsIgnoreCase("Food")){
            System.out.println("You have selected food.");
            if (secondaryOption.equalsIgnoreCase("Snack")){
                System.out.println("You have selected snack.");
            }else if (secondaryOption.equalsIgnoreCase("meal") ){
                System.out.println("Yoy have selected meal.");
            }else{
                System.out.println("no such food option.");
            }




        }


    }
}
