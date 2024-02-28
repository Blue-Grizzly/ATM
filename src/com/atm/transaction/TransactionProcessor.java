package com.atm.transaction;

public interface TransactionProcessor {
    public void processTransaction(Account account, double amount);


}
