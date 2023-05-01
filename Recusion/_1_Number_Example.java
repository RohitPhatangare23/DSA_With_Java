package Recusion;

public class _1_Number_Example {

    public static void main(String[] args) {
//        print the first 5 number
        // one thing is common
        // thaking one parameter and doing same thing. just name is diffrent
        //recursion= recursion means a the function call itself.

        num1(23);
    }

    static void num1(int n){
        System.out.println(n);
        num2(34);
    }
    static void num2(int n){
        System.out.println(n);
        num3(56);
    }
    static void num3(int n){
        System.out.println(n);
        num4(78);
    }
    static void num4(int n){
        System.out.println(n);
        num5(99);
    }
    //function boy here change
    static void num5(int n){
        System.out.println(n);
    }

}
