package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        //sets the card count to 0
        int dealer = 0;
        int cardtotal = 0;
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        //generates the users cards between 1-11
        int usercard = (random.nextInt(11));
        int usercard2 = (random.nextInt(11));

        //generates random card for dealer between 1-11
        int dealercard = (random.nextInt(11));
        int dealercard2 = (random.nextInt(11));

        //gives a total for the dealer and reveals 1 card
        dealer = dealercard + dealercard2;
        System.out.println("dealers face up card is: " + dealercard2);

        //gives a total for user
        int usertotal = usercard + usercard2;
        System.out.println("Your total is: " + usertotal);

        System.out.println("Would you like another card? (Y/N) ");

        String input = scanner.next();
        if (input.equals("Y")) {
            int extracard = cardtotal + random.nextInt(10)+1;
            System.out.println("Your total is now: " + extracard);

            if (cardtotal < 21) {
                System.out.println("Would you like another card? (Y/N) ");
                input = scanner.next();
            } else if (cardtotal > 21) {
                System.out.println("The dealer wins you went bust: ");
            }

            if (input.equals("Y")) {
                extracard = cardtotal + random.nextInt(10)+1;
                System.out.println("Your total is now: " + extracard);
//gives a extra card and asks if they want another if the user total < 21


            } else if (input.equals("N")) {
                if (dealer < cardtotal && cardtotal <= 21) {
                    System.out.println("you win congrats, the dealer had: " + dealer + ", you had " + cardtotal);
                } else if (dealer > cardtotal && dealer <= 21) {
                    System.out.println("you lose!, the dealer had: " + dealer + ", you had: " + cardtotal);
                } else {
                    System.out.println("Not understood");
                }
            }

        }
    }
}


