package javaaa.collection_framework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _4_prority_queue {
    public static void main(String[] args) {

        //use of priority queue is heap it is implementing heap. there min/max heap but P.Q implements min heap.
        // if you want to implement max .heap= Comparator.reverseOrder()

        Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        q.offer(40);
        q.offer(89);
        q.offer(26);
        q.offer(15);
        q.offer(80);
        q.offer(60);
        System.out.println(q);  //[89, 80, 60, 15, 40, 26] max element in fron.
        q.poll();
        System.out.println(q);  //[80, 40, 60, 15, 26]
    }
}
