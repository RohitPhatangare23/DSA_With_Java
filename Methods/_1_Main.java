package Methods;

import java.util.Scanner;

public class _1_Main {
    public static void main(String[] args) {
        // in java function we called as methods
        //DRY= Don't repeat yoursef
        sum();
        mul(8,9);
    }

     static void mul(int x, int y) {
        System.out.println(x*y);
    }

    public static void sum() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter First no. ");
        int a=in.nextInt();
        System.out.println("Enter Second no. ");
        int b=in.nextInt();
        System.out.println("SUM = " + (a+b));

    }
}
