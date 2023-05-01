package sp.company;

import java.util.Arrays;

public class _4_questions_array {
    public static void main(String[] args) {

        //swap array.
        int[] arr={12,45,65,23,9,45,78};
        //swap(arr,1,4);

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {

        int start=0;
        int end=arr.length-1;
        //loop ends when start > end
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
