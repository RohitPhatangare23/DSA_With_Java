package String;

import java.util.Arrays;

public class _1_Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 19};
        int num = 10;
        //everything Start with capital letter is class
        //String is imutable in java
        String name = "Rohit Phatangare";
        System.out.println(Arrays.toString(arr));
        System.out.println(num);
        System.out.println(name);

        String a = "Rohit";       //create garbage collections
        System.out.println(a);
        a = "Phatangare"; //created new objects
        System.out.println(a);
    }

}
