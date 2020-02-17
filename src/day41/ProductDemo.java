package day41;

public class ProductDemo {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setName("iPhone");
        p1.setPrice(699);

        System.out.println(p1.getName());

        // store the price
        double myPrice = p1.getPrice();
        System.out.println(myPrice);  // .sout  or  .soutv


    }
}
