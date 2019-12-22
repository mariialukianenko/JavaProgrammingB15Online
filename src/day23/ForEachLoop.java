package day23;

public class ForEachLoop {
    public static void main(String[] args) {
        
        double[] prices = {99.23, 11.99, 100,23, 99.99, 56.34};
        
        // for each loop syntax
        //for(  dataTypeOfYourArray  variableNameForEachItem  :   yourArrayVariable   )
        // do something with your items

        for (int x = 0; x <=prices.length-1 ; x++) {
            
            double eachPrice = prices[x];
            System.out.println("eachPrice = " + eachPrice);
        }
        System.out.println("-------------------");

        // for each loop, just for array
        for ( double  eachPrice      :   prices    ){
            System.out.println("eachPrice = " + eachPrice);;
        }


    }
}
