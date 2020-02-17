package day40;

public class BankAccount {

    String accountType;
    String accountHolder;
    long accountNumber;
    public double balance;

    // setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance){
        accountType = newAccountType;
        accountHolder = newAccountHolder;
        accountNumber = newAccountNumber;
        balance = newBalance;
    }

    // showAccountBalance
    public void showAccountBalance(){
        System.out.println("current balance: " + balance);
    }

    // showAccountHolderAccountType
    public void showAccountHolderAccountType(){
        System.out.println("Account type: " + accountType);
    }

    // getBalance   return the balance
    public double getBalance(){
        return balance;
    }

    // deposit (amount)
    public void deposit(double amount){
        balance = balance + amount;
    }


    // withdraw (amount)
    public void withdraw(double amount){
        balance = balance - amount;
    }


    // withdraw100$Cash()
    public void withdraw100$Cash(){

        withdraw(100);     // reusing  or  balance - 100
    }


    // purchaseProduct (productPrice, count)
    public void purchaseProduct(double productPrice, int count){
        double totalPrice = productPrice * count;
        balance = balance - totalPrice;

      // or   withdraw(totalPrice);
    }


    // toString
    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
