package String;

import java.util.Arrays;

public class _8_Methods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Kunal   ".strip());  //extra space at the end it will remove
        System.out.println(Arrays.toString(name.split(" ")));

        String ln="Rohit";
        System.out.println(ln.length());
    }
}
