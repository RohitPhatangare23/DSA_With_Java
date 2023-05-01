package GFG_CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class _2_ArrayList {
    public static void main(String[] args) {
        int n = 5;

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);    //[1, 2, 3, 4, 5]

        // Remove element at index 3
        arrli.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(arrli);      //[1, 2, 3, 5]

        // Printing elements one by one
        for (int i = 0; i < arrli.size(); i++) {
            System.out.println(arrli.get(i) + " ");  //1 2 3 5
        }

        boolean a=arrli.isEmpty();
        System.out.println(a);    //false



    }
}
