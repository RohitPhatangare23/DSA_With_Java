package String;

import java.util.Arrays;

public class _3_Output {
    public static void main(String[] args) {
        System.out.println(56);  //take as string
        Integer num = new Integer(56);
        System.out.println(num.toString());
        System.out.println(num);
        System.out.println("Kunal");
        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5}));
//
        String name = null;
        System.out.println(name);

        int[] arr={5,8,6,1,2,4,7,45,12,3};
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num2 : arr) {
            System.out.print(num2 + " ");
        }
    }
}
