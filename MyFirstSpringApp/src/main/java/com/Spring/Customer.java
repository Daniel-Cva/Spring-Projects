package com.Spring;
import java.util.Scanner;
public class Customer extends Bank{
    Scanner scanner = new Scanner(System.in);
    public void withDraw(double Balance) {
        System.out.println("Enter the amount to withdraw");
        double amount = scanner.nextDouble();
        Balance = Balance - amount;
        System.out.println("Your balance is " + Balance);
        System.out.println("Thankyou for using our Service...");
    }

    public void Deposit(double Balance) {
        System.out.println("Enter the amount to deposit");
        double amount = scanner.nextDouble();
        Balance = Balance + amount;
        System.out.println("Your balance is " + Balance);
        System.out.println("Thankyou for using our Service...");
    }
}
