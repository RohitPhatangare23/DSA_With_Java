package Stacks_And_Queue;

public class _4_Custom_Stack_main {
    public static void main(String[] args) throws  StackException{
        _2_CustomStack stack = new _5_Dynamic_Stack(5);

//        _5_Dynamic_Stack stack = new _5_Dynamic_Stack(5);
//        _2_CustomStack stack = new _2_CustomStack(5);

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(89);
        stack.push(89);
        stack.push(89);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }

}
