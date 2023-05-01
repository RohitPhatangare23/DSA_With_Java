package javaaa.collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class _1_arrayy_list {
    public static void main(String[] args) {
        //collection frame work is collection of diffrent classes/interfaces.
        //purpose of using C.F is minimizing of code. (line of code)
        //if your using C.F u need not to create code from scrach

        //generic = what type of data arraylist is going to you contain.

        //arraylist= linkedlist,verctor,stack,arraylist.

        //arraylsit=add,get,remove,cleare,set,contains.


        List <Integer> a =new ArrayList<>();
        a.add(45);
        a.add(65);
        a.add(25);
        a.add(85);
        a.add(15);

        //a.remove(2);  //[45, 65, 85, 15]

        int g=a.get(1); //  fetch data
        System.out.println(g); //   65

        //a.clear();  // []

        //a.set(1,100);  // [45, 100, 25, 85, 15] overwrite data

        boolean f=a.contains(30);     //false
        boolean t=a.contains(65);     //true
        System.out.println(t);

        System.out.println(a); //   [45, 65, 25, 85, 15] arraylist displaying data in form of list.

        for (int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }

        System.out.println("====== List Itrator ==========");

        ListIterator<Integer> l=a.listIterator();

        System.out.println("--------- NOT REVERSE ---------");
        while (l.hasNext()){
            System.out.println(l.next());
        }
        System.out.println("--------- REVERSE ---------");
        while (l.hasPrevious()){
            System.out.println(l.previous());
        }


    }
}
