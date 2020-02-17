package day40;

public class AtTheBank {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        b1.setAllTheValue("Saving", "Mariia", 91647385, 950000);

        b1.showAccountBalance();

        b1.showAccountHolderAccountType();

        b1.deposit(90000);

        System.out.println(b1);
    }
}
