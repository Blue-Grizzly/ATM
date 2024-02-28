package com.atm.account;

import com.atm.customer.Customer;

public class BasicAccount implements Account{
    private double balance;
    private Customer owner;

    public BasicAccount(Customer owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public Customer getOwner() {
        return owner;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. Current balance is $" + balance);
        } else {
            System.out.println("Deposit of $" + amount + " failed. Current balance is $" + balance);
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Current balance is $" + balance);
        }
        System.out.println("Insufficient funds. Withdrawal of $" + amount + " failed. Current balance is $" + balance);
        return false;
    }
}
