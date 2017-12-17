package com.pluralsight;

import java.util.Scanner;

public class Main {
    /*
    https://programmingbydoing.com/

    How old are you specifically Assignment #21
     */
    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
        String name = keyboard.next();
        System.out.println("OK, " + name + ", how old are you?");
        int age = keyboard.nextInt();

        if(age < 16){
            System.out.println("You can't drive, " + name);
        }
        else if (age <=17){
            System.out.println("You can drive but not vote, " + name);
        }
        else if (age <=24){
            System.out.println("You can vote but not rent a car, " + name);
        }
        else
            System.out.println("Your can do pretty much anything, " + name);

    }
}
