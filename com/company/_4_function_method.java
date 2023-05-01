package com.company;

import java.util.Scanner;

public class _4_function_method {
    public static void main(String[] args) {
        //sum();

        //int ans = sum2();
//        System.out.println(ans);

        int ans2 = sum3(20, 30);
        System.out.println(ans2);

        String ok = "good morning";
        greeting(ok);

    }

    /*
        return_type name (arguments) {
            // body
            return statement;
        }
     */
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);

    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
//        System.out.println("This will never execute");
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static void greeting(String ok) {

        System.out.println("hi rohit " + ok);
        //return is used when premitive has.
        //return function always at the end it means finished. your work is done .after that nothing can run (unreacheable thing)
    }
}
