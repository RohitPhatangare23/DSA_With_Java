package sp.company;

import java.util.Arrays;

public class _1_one_dimensional_array {

    public static void main(String[] args) {
        // array is collection of data type.
        // This is Single dimentional 1-d  represent in single row or column.
        // and multi dimentional araay (array of array )  2-d and - 3d;
        // array is collection of homogenous datatype
        // multiple value stoted in single method is called array
        // array strats from 0
        // array is object class  in array
        // new keyword use as object creation
        // array ki super class object hey.
        // all object are stored in heap memory.

        //when we declare array , we can not write size
        // int[23] z; error

        //syntax
        //datatype[] variable_name = new datatype[size];

//        Declaration :

        int[] a, h;  // prefreed   declaration of array. 'a' is getting defined in the stack
        int[] b;
        int c[];
        int[] d;

//        Creation :

        int[] z = new int[80];
        //int[] z=new int[0];    // compile and run
        //int[] z=new int[-5];  // compile but show -ve array size exception.


//        Initialization :

        // when we create int type array default value is o
        // when we create String type array default value is null
        a = new int[50];  //initialisation: actually here object is being created in the memory (heap)
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        //a[51]=522;  // show error Array index is out of bounds exception.

        int[] intArray = new int[]{15,24,33,47,55,62,77,85,91,103};
        int[] best = {5, 4, 8, 7};  // default value is not initalized by 0.
        System.out.println(Arrays.toString(best));  // [5, 4, 8, 7]
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray.length);
        System.out.println(Arrays.toString(intArray));   //[15, 24, 33, 47, 55, 62, 77, 85, 91, 103]

//        Retrive :

        //for each loop :
        for (int j : best) {
            System.out.print(j + ",");
        }

        System.out.println();

        for (int i = 0; i < best.length; i++) {
            System.out.print(best[i] + ",");
        }


    }
}
