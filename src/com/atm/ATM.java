package com.atm;
import com.atm.card.BasicCard;

import java.util.Scanner;


public class ATM {
    public static void main(String[] args) {
        BasicCard card = new BasicCard;
        BasicCardReader cardReader = new BasicCardReaer;
        BasicAccount account = new BasicAccount;
        BasicSecuritySystem securitySystem = new BasicSecuritySystem;
        BasicTransactionProcessor transactionProcessor = new BasicTransactionProcessor;
        BasicCashDispenser cashDispenser = new BasicCashDispenser;

        System.out.println("This is an ATM system!");


        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        boolean quit = false;
        if(!quit){
            System.out.println("not quit");

            if(!input.equals("quit")){
                cardReader.validate(card);
                String pin = scanner.next();

            } else {
                quit = true;

            }
        }
    }
}