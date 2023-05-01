package sp.company;

public class _8_merge_sort {
    int[] array;
    int length;
    int[] tempMergeArray;

    public static void main(String[] args) {

        int[] inpputArr = {48, 36, 52, 19, 94, 21};
        _8_merge_sort ms = new _8_merge_sort();
        ms.sort(inpputArr);

        for (int i : inpputArr) {
            System.out.print(i + " ");
        }

    }

    private void sort(int inpputArr[]) {
        this.array = inpputArr;
        this.length = inpputArr.length;
        this.tempMergeArray = new int[length];
        divideArray(0, length - 1);
    }

    public void divideArray(int lowerindex, int higherindex) {
        if (lowerindex < higherindex) {
            int middle = lowerindex + (higherindex - lowerindex)/2;

            //it will sort the left side of an array
            divideArray(lowerindex, middle);

            //it will sort right side of an array
            divideArray(middle + 1, higherindex);

            mergeArray(lowerindex,middle,higherindex);
        }
    }

    public void mergeArray(int lowerindex, int middle, int higherindex) {
        for (int i = lowerindex; i <= higherindex; i++) {
            tempMergeArray[i] = array[i];
        }
        int i = lowerindex;
        int j = middle + 1;
        int k = lowerindex;
        while (i <= middle && j <= higherindex) {
            if (tempMergeArray[i] <= tempMergeArray[j]) {
                array[k] = tempMergeArray[i];
                i++;
            } else {
                array[k] = tempMergeArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergeArray[i];
            k++;
            i++;
        }
    }
}
