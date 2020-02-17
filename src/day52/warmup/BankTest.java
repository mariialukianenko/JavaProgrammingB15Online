package day52.warmup;

public class BankTest {

    public static void main(String[] args) {

        Account a1 = new Account("John Snow", 10000);
        Account a2 = new Account("Hannah", 7000);

        System.out.println(a1);
        System.out.println(a2);

        a1.transferAll(a2);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println(a1.isPalindrome());
        System.out.println(a2.isPalindrome());
    }
}
