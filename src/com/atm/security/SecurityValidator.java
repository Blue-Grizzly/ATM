package com.atm.security;

import java.util.List;

public class SecurityValidator implements SecuritySystem {
    @Override
    public boolean ValidateCard(String pin, String correctPin) {

        return pin.equals(correctPin);
    }
}
