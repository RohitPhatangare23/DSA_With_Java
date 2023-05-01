package Recusion;

public class _1_start_Recursion {
    public static void main(String[] args) {
        // Q1) only one function you have that call "Hi I am Rohit" 5 times
        // => the function is calling another function.
        message1();

    }

    static void message1() {
        System.out.println("Hi I am Rohit 1");
        message2();
    }

    static void message2() {
        System.out.println("Hi I am Rohit 2");
        message3();
    }

    static void message3() {
        System.out.println("Hi I am Rohit 3");
        message4();
    }

    static void message4() {
        System.out.println("Hi I am Rohit 4");
        message5();
    }

    static void message5() {
        System.out.println("Hi I am Rohit 5");
    }
}
