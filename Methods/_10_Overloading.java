package Methods;

public class _10_Overloading {
    public static void main(String[] args) {
        //2 or more function have same name,return type but diffrent argumments
        //this is known as function overloading
        //compile time its going to deside which function to run
        //Function overloading happens when 2 function have same name but diff parameters
        fun(67);
        fun("Kunal Kushwaha");
        //sum(5,5);
        int ans = sum(3, 4, 78);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
