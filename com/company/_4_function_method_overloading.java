package com.company;

public class _4_function_method_overloading {
    public static void main(String[] args) {
        //2 or more function have same name,return type but diffrent argumments
        //this is known as function overloading
        //compile time its going to deside which function to run
        //fun(10);
//        fun("rohit");
        int ans=sum(2,2);
        System.out.println(ans);
        //sum(5,5,5);

    }
    static void fun(int a){
        System.out.println("first one ");
        System.out.println(a);
    }
    static  void fun(String s){
        System.out.println("second one ");
        System.out.println(s);
    }
    static  int  sum(int a,int b){

        return a+b;
    }
    static  int  sum(int a,int b,int c){

        return a+b+c;
    }


}
