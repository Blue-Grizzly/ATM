package com.atm.card;

import com.atm.account.Account;

public interface Card {

    Account getAccount();

    int getPin();
    int getCardNumber();

}
