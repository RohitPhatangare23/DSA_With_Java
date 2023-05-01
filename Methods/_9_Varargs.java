package Methods;

import java.util.Arrays;

public class _9_Varargs {
    public static void main(String[] args) {
        //here u can take any no. of argument , internaly stored in array
        fun(1,5,4,8,7,9,4,6,2,3,4,7,5,9);
        fun(); //empty array
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
        demo(1,5,4,8,6,2,8,1,8,4);
        demo("rohit","ritik","raj","yash","ok");
        //demo(); // varargs parameter it can't be ematy=ambiguty=अस्पष्टता
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
//  varaible length argument at should be end
    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
