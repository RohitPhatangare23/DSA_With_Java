package javaaa.collection_framework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class _4_queuee {
    public static void main(String[] args) {

        // queue =linkedlist=offer,poll ,peek
        //       = priority_queue= offer,poll

        //nqueue= insert data
        //dqueue= delete data.

        //offer function gives insert data the data.
        //poll function= delete data. the data.
        //peek function find out front element of data.

        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q); //[10, 20, 30, 40, 50]

        q.peek();
        System.out.println(q.peek()); //10

        q.poll();
        System.out.println(q); //[20, 30, 40, 50]

        q.add(12);
        System.out.println(q);  //[20, 30, 40, 50, 12]

        //q.clear();
        //System.out.println(q);  //[]










    }
}
