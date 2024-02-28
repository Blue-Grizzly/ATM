package com.atm.card;

import com.atm.account.Account;

public class BasicCard implements Card {

    private String cardNumber;
    private String pin;
    private Account account;

    public BasicCard(String cardNumber, String pin, Account account) {
        setCardNumber(cardNumber);
        setPin(pin);
        setAccount(account);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {

}
