package com.company;

import java.util.Arrays;

public class _4_function_method_varargs {
    public static void main(String[] args) {
        //fun(2,5,9,6,2,7,4,1,2,5,9,3,4,8,3);
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
        // demo(); // its never be empty. ambiguity
    }

    static void demo(int ...v) {
        //variable length argument = here u can take any no. of argument
        //variable length argument always at the end.
        //System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println();
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

}

