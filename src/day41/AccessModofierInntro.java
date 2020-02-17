package day41;

import day40.BankAccount;

public class AccessModofierInntro {

    public static void main(String[] args) {

     //   BankAccount b1 = new BankAccount();

        // what is default access modifier
        // if there is no access modifier
        // in front of method modifier
        // it means it has default value access modifier
        // it only accessible within the same package
      //  b1.showAccountBalance();

        // the banAccount instance field from day40
        // does not HAVE ANY access modifier
        // so it means it has default access modifier
     //   b1.balance = 1000;


        // access modifier can be used for fields and method. there are 4 of them
        // carrently we care about 3:
        // public
        // default    -  accessible within the same package
        // private   -   accessible only within the same class


        Person p1 = new Person();
//        p1.name = "Mariia";
//        p1.age = 25;
//        p1.ssn = 87634125;

        p1.setAll("Mariia", 25, 84756389);
        System.out.println(p1);


        System.out.println(p1.getName()); // this method wiil work, becouse it is public

        System.out.println(p1.getName());
        p1.setName("Illia");
        System.out.println(p1.getName());

        p1.setAge(24);
        p1.setSsn(74693749);
        int IlliaAge = p1.getAge();
        System.out.println("IlliaAge = " + IlliaAge);

        System.out.println(p1);
    }
}
