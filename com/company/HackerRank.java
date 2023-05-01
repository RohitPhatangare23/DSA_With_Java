package com.company;

import java.util.Scanner;

public class HackerRank {

    /*
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=input.nextInt();

        if (num%2 == 0){
            if (num>=2 && num<=5){
                System.out.println("Not Weired");
            }
            else if (num>=6 && num<=20){
                System.out.println("Weired");
            }
            else{
                System.out.println("Not Weired");
            }

        }
        else {
            System.out.println("Weired");
        }
    }

     */

    /*

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter Table Number : ");
        int n = input.nextInt();

        for (int i=1; i<=10;i++){
            System.out.println(n+"x"+i +"="+ n*i );
        }

    }

     */



        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                // Java Loops II - Hacker Rank Solution Java START
                for (int j = 0; j < n; j++)
                {
                    a += b * (int) Math.pow(2, j);
                    System.out.print(a + " ");
                }
                System.out.println();
            }
            in.close();
        }
    }



