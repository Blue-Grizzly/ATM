package com.atm.transaction;

import com.atm.account.Account;

public interface TransactionProcessor {
    public void processTransaction(Account account, double amount);


}
