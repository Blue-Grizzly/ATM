package com.atm.security;

import java.util.List;

public class SecurityValidator implements SecuritySystem {
    @Override
    public boolean validateCard(int pin, int cardNumber, List<Card> cards){
        for (Card card : cards){
            if(card.getCardNumber() == cardNumber && card.getPin() == pin){
                return true;
            }
        }
        return false;
    }

}
