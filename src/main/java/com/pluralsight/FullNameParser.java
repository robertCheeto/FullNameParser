package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int i = 1;

    System.out.print("Please enter your full name: ");
    String fullName = keyboard.nextLine().trim();

    // need to use the array index numbers to split strings into different variables to print
        // also need to figure out how to print first and last name when no middle name is given
    String[] parsedNames = fullName.split("\\s+");
    // fullName.split("\\ "); also works

    if (parsedNames.length < 3) {
        String firstName = parsedNames[0];
        String lastName = parsedNames[1];
        System.out.printf("First Name: %s\nLast Name: %s", firstName, lastName);
        // easier method to print the same result above^
        // souf(First Name: %s\nLast Name: %s, parsedNames[0], parsedNames[1])
        }
    else if (parsedNames.length < 4){
        String firstName = parsedNames[0];
        String middleName = parsedNames[1];
        String lastName = parsedNames[2];
        System.out.printf("First Name: %s\nMiddle Name: %s\nLast Name: %s", firstName, middleName, lastName);
        }
    else {
        System.out.println("Invalid Name Format");
    } // end of else statement

    } // end of main()
}
