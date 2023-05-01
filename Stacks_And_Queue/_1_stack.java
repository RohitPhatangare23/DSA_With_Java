package Stacks_And_Queue;

import java.util.*;

public class _1_stack {
    public static void main(String[] args) {
        //Stack=LIFO (Last in first out)    //Plats are stacked in party  insert=push delete=pop
        // stack store value in meemory in form of array (internale it's array but is not acciable)

        //Queue= FIFO (First in First out)  queue is interface  is not class

        //Q1 when to use stack and queue?
        //=> when you strore answers anwers so far , puts value in behind and use it in later on. and traversing recusion and iteration

        //Deque= is doubly ended queue and insert and remove both side . null elements are not alowed .
        //no capcity restiction it's fater than linked list and stack

//        Stack<Integer> stack = new Stack<>();

        //int s=stack.push(34);
        //System.out.println(s);   //34

//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        //System.out.println(stack.pop());   // EmptyStackException   one extra pop


//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(6);
//        queue.add(5);
//        queue.add(19);
//        queue.add(1);
//
//        System.out.println(queue.remove());  //3
//        System.out.println(queue.remove());  //6
//
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.add(59);
        deque.add(29);
        deque.add(39);
        deque.addLast(78);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);

        // etc etc
    }

}
