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


        boolean quit = false;

        while(!quit){
            System.out.println("+------------------------+");
            System.out.println("|                        |");
            System.out.println("|-This is an ATM system!-|");
            System.out.println("|                        |");
            System.out.println("|    MSG_INSERT_CARD     |");
            System.out.println("|                        |");
            System.out.println("+------------------------+");

            String input = scanner.next();
            if(!input.equals("quit")){
                Card card = cardReader.validateCard(input);

                if(card != null){

                    System.out.println("+------------------------+");
                    System.out.println("|                        |");
                    System.out.println("|     MSG_INPUT_PIN      |");
                    System.out.println("|                        |");
                    System.out.println("+------------------------+");

                    Account account = card.getAccount();
                    String pinCode = scanner.next();

                    if(securitySystem.ValidateCard(card.getPin(), pinCode)){

                        System.out.println("+------------------------+");
                        System.out.println("|                        |");
                        System.out.println("|    MSG_INPUT_AMOUNT    |");
                        System.out.println("|                        |");
                        System.out.println("+------------------------+");

                        double amount = Double.parseDouble(scanner.next());

                        cashDispenser.ATMMessage(amount, transactionProcessor.processTransaction(account, amount));

                        System.out.println("Quit?(Y/n)");
                        char confirm = scanner.next().charAt(0);
                        if(confirm == 'y'){
                            quit=true;
                            System.out.println("+------------------------+");
                            System.out.println("|                        |");
                            System.out.println("|    MSG_QUIT_RECEIVED   |");
                            System.out.println("|                        |");
                            System.out.println("+------------------------+");
                        }
                    } else {
                        System.out.println("+------------------------+");
                        System.out.println("|                        |");
                        System.out.println("|   ERR_AUTHENTICATION   |");
                        System.out.println("|                        |");
                        System.out.println("+------------------------+");
                    }
                } else {
                    System.out.println("+------------------------+");
                    System.out.println("|                        |");
                    System.out.println("|    ERR_INVALID_CARD    |");
                    System.out.println("|                        |");
                    System.out.println("+------------------------+");
                }

            } else {
                quit = true;
                System.out.println("+------------------------+");
                System.out.println("|                        |");
                System.out.println("|    MSG_QUIT_RECEIVED   |");
                System.out.println("|                        |");
                System.out.println("+------------------------+");
            }
        }
    }
}