package sp.company;

import com.company._11_Binary_search;

public class _10_heap_sort {
    public static void main(String[] args) {
        int[] arr = {22, 13, 17, 11, 10, 14, 12};
        _10_heap_sort hs = new _10_heap_sort();
        hs.sort(arr);
        hs.printarray(arr);
    }

    void sort(int[] arr) {
        int leng = arr.length;
        for (int i = leng / 2 - 1; i > 0; i--) {
            heapify(arr, leng, i);
        }
        //swap the elements and heapify again.
        for (int i=leng-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i;   // parent node of index
        int li = 2 * i + 1;   // left child node index position
        int ri = 2 * i + 2;   // right child node index position

        if (li < n && arr[li] > arr[largest]) {
            largest = li;
        }
        if (ri < n && arr[ri] > arr[largest]) {
            largest = ri;

        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }


    }
    void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
