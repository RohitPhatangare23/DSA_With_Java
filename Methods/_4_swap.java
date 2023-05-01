package Methods;

public class _4_swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//         swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);

        System.out.println(a + " " + b);

//        changeName();
        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naame) {
        naame = "Rahul Rana"; // creating a new object
//        System.out.println(naame);
    }
//
    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function scope only.
    }

}
