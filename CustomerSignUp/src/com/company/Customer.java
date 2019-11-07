package com.company;

import java.util.Scanner;
public class Customer extends Person {
    Scanner input = new Scanner(System.in);

    public Customer (String name, String address, String phoneNumber){

        System.out.println("\nPlease confirm the following (y/n).");
        //Confirm
        System.out.println("\nName: "+name+".");
        System.out.println("Address: "+address);
        System.out.println("Number: "+phoneNumber);

        char confirmation = input.next().toLowerCase().charAt(0);

        if (confirmation=='y'){
            mailingList();
        }   else if (confirmation == 'n'){
            System.out.println("Please re-enter information correctly.");
            UserInput();
        }
    }

    public void mailingList(){

        System.out.println("\nWould you like to be on our mailing List? (y/n)");
        char mailing = input.next().toLowerCase().charAt(0);

        //Test
        if (mailing=='y'){
            System.out.println("You have been signed up for the mailing list!");
        }   else if (mailing == 'n'){
            System.out.println("You have been removed from the mailing list");
        }
    }
}
