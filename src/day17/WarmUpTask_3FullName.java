package day17;

public class WarmUpTask_3FullName {
    public static void main(String[] args) {

      String fullName = "aRya sTaRk";

      String firstName = fullName.substring(0,4);
      String lastName = fullName.substring(5);

      String firstNameCorrect = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
        System.out.println(firstNameCorrect);

      String lastNameCorrect = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrect);

        System.out.println(firstNameCorrect+ " "+lastNameCorrect);

    }
}
