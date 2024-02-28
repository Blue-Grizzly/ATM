package com.atm.security;

import java.util.List;

public interface SecuritySystem {
    boolean ValidateCard(String pin, String correctPin);
}
