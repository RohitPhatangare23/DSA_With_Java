package com.company;

import java.util.Arrays;

public class _4_function_method_swap {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);

        //CREATE ARRAY.
        int[] arr={11,56,89,75,15,33};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] arr) {
        arr[0]=55;  // int is modifyable . if u make a change to object via this ref variable , same object will be changed.
    }

    static void changeName(String naam) {
        // NO PASS BY REFRENCING ONLY PASS BY VALUE.
        System.out.println(naam); // POINTING SAME OBJECT.
        naam = "Rahul Rana"; // creating a new object  ,, STRINGS ARE FINAL , YPU CAN'T MODIFY IT. #imutable
        System.out.println(naam);
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function scope only.
        System.out.println(num1);
        System.out.println(num2);
    }


}