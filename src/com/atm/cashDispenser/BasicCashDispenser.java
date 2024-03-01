package com.atm.cashDispenser;

public class BasicCashDispenser implements CashDispenser {
    @Override
    public void ATMMessage(double amount, boolean sucess){
        if(sucess){
            System.out.println(amount + "$ has been withdrawn from your account");
        } else{
            return;
        }
    }
}
