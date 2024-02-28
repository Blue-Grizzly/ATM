package com.atm.account;

import com.atm.customer.Customer;

public interface Account {
    public double getBalance();
    public Customer getOwner();
    public void deposit(double amount);
    public boolean withdraw(double amount);
}
