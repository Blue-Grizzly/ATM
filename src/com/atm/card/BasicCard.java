package com.atm.card;

public class BasicCard implements Card {

    private String cardNumber;
    private String pin;
    private String account;

    public BasicCard(String cardNumber, String pin, string account) {
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
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
