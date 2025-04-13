package com.Spring;

import java.util.Scanner;

public class Bank {
    private double Balance;

    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public void chooseService(){
        Customer customer = new Customer();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank");
        System.out.println("Choose your service");
        System.out.println("Deposit or withdraw");
        System.out.println("Enter your choice");
        String service = scanner.nextLine();

        switch(service){
            case "Withdraw":
                customer.withDraw(Balance);
                break;
            case "Deposit":
                customer.Deposit(Balance);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
