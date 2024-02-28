package com.atm.transaction;

public class BasicTransactionProcessor implements TransactionProcessor {

    public void processTransaction(Account account, double amount){
        if (account != null){
            if(account.withdraw(amount)){
                System.out.println("Transaction processed for amount: $" + amount);
            } else {
                System.out.println("Transaction denied");
            }}
        else {
                System.out.println("Account doesn't exist");
            }

        }
    }

