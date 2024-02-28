package com.atm.card;

import com.atm.account.Account;

public interface Card {

    Account getAccount();

    String getPin();
    String getCardNumber();

}
