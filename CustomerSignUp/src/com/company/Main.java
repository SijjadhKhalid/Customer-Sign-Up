package com.company;
/*
Sijjad Khalid
CustomerSignUp
*/
/*
Purpose: Get the customers information and ask user whether or not they want to be on the mailing list
Input: Enter name, address, number. Then input y/n to be on the mailing list
Processing: information will be sent to another class with a constructor
Output: Display the customers information and display whether the customer signed up for mailing list
 */
public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.UserInput();
    }
}
