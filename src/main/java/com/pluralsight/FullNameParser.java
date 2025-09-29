package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Please enter your full name: ");
    String fullName = keyboard.nextLine().trim();

    String[] parsedNames = fullName.split(Pattern.quote(""));
        System.out.println(parsedNames);



    }
}
