package javaaa.collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _5_set {
    public static void main(String[] args) {

        // set=set is collection of data. it will store data in hash table .Hash Tree contain a hash value , Hash can not to be same value.
            //that's mean set interface does not conatins duplicate value   (HashSet<>)
            //unorderd set of items.

        // linkhashset (LinkedHashSet<>)= contains propeties of L.L as well as H.s , L.L+SET
        // diffrence only this Hash Set implements using Linked List
        // print a data as we insert it
        // ORDERED collection

        //tree set (TreeSet<>) = sorted data ,travel  as a  binary search tree ,constains property SET+Binary Search Tree

        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(50);
        s.add(200);
        s.add(80);
        s.add(40);
        System.out.println(s);  // [80, 50, 200, 40, 10]

        s.remove(200);
        System.out.println(s); //[80, 50, 40, 10]

        System.out.println(s.size()); //5

        System.out.println(s.contains(80)); //true

        s.clear();
        System.out.println(s); //[]



    }
}
