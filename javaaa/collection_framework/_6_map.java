package javaaa.collection_framework;

import java.util.HashMap;
import java.util.Map;

public class _6_map {
    public static void main(String[] args) {

        // map = pairing some data, we have key and associate value and we are mapping those value
        // key should be unique.

        Map<Integer , String> m=new HashMap<>();
        m.put(1,"Rohit");
        m.put(2,"ritik");
        m.put(3,"yash");
        m.put(4,"ankit");
        m.put(5,"Ram");
        //m.put(3,"mukesh");  // overwrite/update
        m.putIfAbsent(3,"bhakti");  //not-overwite {1=Rohit, 2=ritik, 3=yash, 4=ankit, 5=Ram}
        System.out.println(m);   //{1=Rohit, 2=ritik, 3=yash, 4=ankit, 5=Ram}

        m.remove(3);
        System.out.println(m);  //{1=Rohit, 2=ritik, 4=ankit, 5=Ram}

        System.out.println(m.isEmpty());  //false

        for (Integer i: m.keySet()){
            System.out.println(i);   // 1 2 3 4 5
        }
        for (String s: m.values()){
            System.out.println(s);   //Rohit ritik yash ankit Ram

        }


    }
}
