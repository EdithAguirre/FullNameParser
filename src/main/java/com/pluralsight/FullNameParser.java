/*
Program that parses the name of the user and processes it to display
the individual pieces of the name
 */
package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);

        /*
        Prompts the user to enter a name in one of the following two
        formats: first last or first middle last
         */
        System.out.print("Please enter your name (first last) or (first middle last): ");
        String fullName = scanner.nextLine();

        // Trim and split full name into individual pieces in an array
        String[] fullNameSplit = fullName.trim().split(" ");

        // Display the first name
        System.out.println("First name: " + fullNameSplit[0]);

        // Display if the user has a middle name or not and display last name
        if(fullNameSplit.length == 3){
            System.out.println("Middle name: " + fullNameSplit[1]);
            System.out.println("Last name: " + fullNameSplit[2]);
        }
        else {
            System.out.println("Middle name: (none)");
            System.out.println("Last name: " + fullNameSplit[1]);
        }
    }
}