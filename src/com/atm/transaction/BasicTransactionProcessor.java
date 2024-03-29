package com.atm.transaction;

import com.atm.account.Account;

public class BasicTransactionProcessor implements TransactionProcessor {

    public boolean processTransaction(Account account, double amount){
        if (account != null){
            if(account.withdraw(amount)){
                System.out.println("Transaction processed for amount: $" + amount);
                return true;
            } else {
                System.out.println("Transaction denied");
                return false;
            }}
        else {
                System.out.println("Account doesn't exist");
                return false;
            }

        }
    }

