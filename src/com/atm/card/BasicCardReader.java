package com.atm.card;

import com.atm.accont.BasicAccount;
import com.atm.customer.BasicCustomer;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class BasicCardReader implements CardReader {

private final Map<String, Card> validCards = new HashMap<String, Card>()
{
    {
        put("1234567890123456", new BasicCard("1234567890123456", "1234",
        new BasicAccunt(new BasicCustomer("John","Danger","Doe"))));
        put("1111111111111111", new BasicCard("1111111111111111", "1234",
                new BasicAccunt(new BasicCustomer("Jane","Peace","Doe"))));
    }};

    public Card validateCard(String cardNumber) {
    if (cardNumber != null && validCards.containsKey(cardNumber))  {
        return validCards.get(cardNumber);
        }
    return null;
    }
}
