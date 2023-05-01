package Methods;

import java.util.Scanner;

public class _3_StringExample {
    public static void main(String[] args) {   //main is first method to run
        String message = greet();
        System.out.println(message);

        Scanner in  = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String naam = in.next();

        String personalised = myGreet(naam);
        System.out.println(personalised);
    }

    static String myGreet(String name) {  //argument value does't have to be same
        String message = "Hello " + name;
        return message;
    }


    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
