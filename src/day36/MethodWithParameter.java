package day36;

public class MethodWithParameter {
    public static void main(String[] args) {

        addOneHundred(25);
        addOneHundred(new Integer(100));

        int num = 7;
       addOneHundred(num);

        System.out.println();
        int number = 10;
        addOneHundred(number);

        System.out.println(number);
    }
    public static void addOneHundred (int x){
        x = x + 100;
        System.out.println(x);
    }

}
