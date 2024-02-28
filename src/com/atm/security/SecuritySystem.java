package com.atm.security;

import java.util.List;

public interface SecuritySystem {
    boolean ValidateCard(int pin, int correctPin);
}
