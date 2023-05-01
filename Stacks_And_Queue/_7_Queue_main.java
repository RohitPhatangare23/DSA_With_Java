package Stacks_And_Queue;

public class _7_Queue_main {
    public static void main(String[] args) throws Exception {

        _8_Circular_Queue queue=new _8_Circular_Queue();

        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
        queue.display();
        queue.insert(133);
        queue.display();
//
        System.out.println(queue.remove());
        queue.insert(99);
        queue.display();

    }

}
