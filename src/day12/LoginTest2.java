package day12;

public class LoginTest2 {
    public static void main(String[] args) {

        String userName = "abc123";
      boolean  userNameCorrect = userName.equals("Abc123");
        System.out.println(userNameCorrect);

        boolean userNameCorrect2 = userName.equalsIgnoreCase("Abc123");
        System.out.println(userNameCorrect2);

    }
}
