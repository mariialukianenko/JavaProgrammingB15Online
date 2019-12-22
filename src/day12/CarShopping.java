package day12;

public class CarShopping {
    public static void main(String[] args) {

        String carBrand = "corOlla";
        int carPrice = 60000;
        int budget = 40000;
/*
        if (carBrand.equals("corolla") || (carBrand.equals("tesla") && carPrice<=budget)){
            System.out.println("Car acquired.");
        }else
            System.out.println("Not what I am looking for.");
*/

      if (carBrand.equalsIgnoreCase("corolla")) {
          System.out.println("Car acquired.");
      }else if (carBrand.equalsIgnoreCase("tesla") && carPrice<=budget) {
          System.out.println("Car acquired.");
      } else {
          System.out.println("Not what I am looking for.");
      }
    }
}
