package GFG_CollectionFramework;

import java.util.Hashtable;
import java.util.Vector;

public class _1_intro {
    public static void main(String[] args) {
        int[] arr={2,4,5,9,6,7};
        Vector<Integer> v=new Vector<>();
        Hashtable<Integer,String> h=new Hashtable<>();
        // Adding the elemegnts into the
        // vector
        v.addElement(10);
        v.addElement(20);

        // Adding the element into the
        // hashtable
        h.put(1, "Rohit");
        h.put(2, "Yash");
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

    }
}
