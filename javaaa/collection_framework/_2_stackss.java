package javaaa.collection_framework;

import java.util.Scanner;
import java.util.Stack;

public class _2_stackss {
    public static void main(String[] args) {
        //imp funnctions in stack = push,peek,pop.

        Stack <Integer> s=new Stack<>();

        s.push(100);  //4
        s.push(200); //3
        s.push(300); //2
        s.push(400);  //1
        System.out.println(s); // [100, 200, 300, 400]

        int d= s.peek();
        System.out.println(d);  //400

        int a=s.search(200); //2
        System.out.println(a);

        //before poping data check under flow condition
        s.pop();   // delete 1 value
        System.out.println(s); //[100, 200, 300]


        Scanner in=new Scanner(System.in);
        System.out.println("Enter Numbers");
        for (int i=0;i<5;i++){
                int k=in.nextInt();
                s.push(k);

        }



    }
}
