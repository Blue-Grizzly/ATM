package com.atm.transaction;

import com.atm.account.Account;

public interface TransactionProcessor {
    public boolean processTransaction(Account account, double amount);


}
