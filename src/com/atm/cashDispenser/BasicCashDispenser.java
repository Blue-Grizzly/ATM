package com.atm.cashDispenser;

public class BasicCashDispenser implements CashDispenser {
    @Override
    public void ATMMessage(double amount){
        System.out.println(amount + "$ has been withdrawn from your account");
    }
}
