package com.company;

public class _4_function_method_shadow {
    //int x = 90; // object dependent thing  , u can't use object dependent thing on object independent thing. there for we add static
    static int x = 90; // this will be shadowed at line 8  there for we add static  // lower lever is overriding upper level
    public static void main(String[] args) {        // object independent thing
        System.out.println(x); // 90
        int x= // the class variable at line 5 is shadowed by this  // declareing
        x=40; // initiallized
        System.out.println(x); // scope will begin when value is initialised
        // variable with H.L scope is hidden

        System.out.println(x); // 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
