package com.company;

import java.util.Scanner;

public class _4_function_method_stringss {
    // main is the first method to run
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

        Scanner in  = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }



    // pass the value of numbers when you are calling the method in main()
    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
