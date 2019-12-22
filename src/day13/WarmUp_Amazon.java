package day13;

import javax.swing.*;

public class WarmUp_Amazon {
    public static void main(String[] args) {

        String memberType = "prime member";
        double amount = 15.99d;
        int shippingFee = 0;

        if (memberType.equalsIgnoreCase("Prime member")) {
            System.out.println("You get 1 day free shipping.");
            System.out.println("Your final price is " + amount);
        } else if (!memberType.equalsIgnoreCase("Prime member") && amount > 25) {

            System.out.println("Not a prime member, but your order more than 25.");
            System.out.println("You got free shipping on amount " + amount);

            }else{

                System.out.println("Do you wanna sign up for prime membership?");
                shippingFee = 5;
                amount += shippingFee;  // or amount = amount + shippingFee
                System.out.println("Your final amount is " + amount);
            }
            }
        }

