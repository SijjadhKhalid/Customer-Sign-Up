package com.company;

import java.util.Scanner;
public class Person {
    Scanner input = new Scanner(System.in);

    public void UserInput() {
        //users name
        System.out.println("Name: ");
        String name = input.nextLine();

        //Users address
        System.out.println("Address: ");
        String address = input.nextLine();

        //Users number
        System.out.println("Number: ");
        String number = input.next();

        //constructor
        Customer customerObject = new Customer(name, address, number);

    }
}
