package com.atm;
import com.atm.account.Account;
import com.atm.card.BasicCardReader;
import com.atm.card.Card;
import com.atm.cashDispenser.BasicCashDispenser;
import com.atm.security.SecurityValidator;
import com.atm.transaction.BasicTransactionProcessor;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        BasicCardReader cardReader = new BasicCardReader();
        SecurityValidator securitySystem = new SecurityValidator();
        BasicTransactionProcessor transactionProcessor = new BasicTransactionProcessor();
        BasicCashDispenser cashDispenser = new BasicCashDispenser();

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        boolean quit = false;

        while(!quit){
            System.out.println("+------------------------+");
            System.out.println("|                        |");
            System.out.println("|-This is an ATM system!-|");
            System.out.println("|                        |");
            System.out.println("+------------------------+");

            if(input.equals("quit")){
                Card card = cardReader.validateCard(scanner.next());
                if(card != null){
                    Account account = card.getAccount();
                    String pinCode = scanner.next();

                    if(securitySystem.ValidateCard(card.getPin(), pinCode)){
                        System.out.println("MSG_INPUT_AMOUNT");
                        double amount = Double.parseDouble(scanner.next());

                        transactionProcessor.processTransaction(account, amount);
                        cashDispenser.ATMMessage(amount);
                    } else {
                        System.out.println("ERR_AUTHENTICATION");
                    }
                } else {
                    System.out.println("ERR_INVALID_CARD");
                }

            } else {
                quit = true;
                System.out.println("MSG_QUIT_RECIEVED");
            }
        }
    }
}