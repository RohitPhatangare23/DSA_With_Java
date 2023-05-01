package Stacks_And_Queue;

public class _9_Dynamic_Queue extends _8_Circular_Queue{
    public _9_Dynamic_Queue() {
        super();
    }

    public _9_Dynamic_Queue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {

        // this takes care of it being full
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        // at this point we know that array is not full
        // insert item
        return super.insert(item);
    }
}
