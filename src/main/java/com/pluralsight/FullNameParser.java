package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Please enter your full name: ");
    String fullName = keyboard.nextLine().trim();

    // need to use the array index numbers to split strings into different variables to print
        // also need to figure out how to print first and last name when no middle name is given
    String[] parsedNames = fullName.split("\\s+");
        System.out.println(parsedNames[0]);



    }
}
