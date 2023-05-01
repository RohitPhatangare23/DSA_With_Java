package String;

import java.util.ArrayList;

public class _5_Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');   //ASCII +  97+98
        System.out.println("a" + "b");   //Concatinate because of sting
        System.out.println((char)('a' + 3));  //97+3

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" + 'b'); //one of the datatype is string is string
    }
}
