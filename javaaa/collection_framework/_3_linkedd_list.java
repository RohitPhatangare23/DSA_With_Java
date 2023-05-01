package javaaa.collection_framework;

import java.util.LinkedList;

public class _3_linkedd_list {
    public static void main(String[] args) {

        //linkedlist=add,remove,addall,cleare,contains,set,get.

        LinkedList <Integer> l=new LinkedList<>();
        l.add(100);  //0
        l.add(400);  //1
        l.add(800);  //2
        l.add(600);  //3
        l.add(300);  //4          //0    1     2   3    4
        System.out.println(l);  //[100, 400, 800, 600, 300]

        int p=l.get(2);
        System.out.println(p);  //800

        l.set(1,200);
        System.out.println(l);  //[100, 200, 800, 600, 300]

        l.remove(3);
        System.out.println(l);   //[100, 200, 800, 300]

        boolean b=l.contains(800);
        System.out.println(b);  //true  , no.it will exitsis or not

        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        l.clear();
        System.out.println(l);  // cleare all data in list.[]


    }
}
