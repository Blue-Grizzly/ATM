package com.atm.security;

import java.util.List;

public interface SecuritySystem {
    public boolean validateCard(int pin, int cardNumber, List<Card>cards);


}
