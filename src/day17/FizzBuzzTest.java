package day17;

public class FizzBuzzTest {
    public static void main(String[] args) {

        // if a number can be devide by both 3 and 5  == fizzbuzz number
        // if can divided by 5 == fizz number
        // bu 3 == buzznumber

//        int num = 15;
//        if (num%5==0 && num%3 ==0){
//            System.out.println(num + " fizz buzz");
//        }else if (num%5==0){
//            System.out.println(num + " fizz");
//        }else if (num%3==0) {
//            System.out.println(num + " buzz");
//        }

        int num = 1;
        while (num <= 100){

       if (num%5==0 && num%3 ==0){
            System.out.println(num + " fizz buzz");
        }else if (num%5==0){
            System.out.println(num + " fizz");
        }else if (num%3==0) {
            System.out.println(num + " buzz");
        }
            ++num;
        }

    }
}
