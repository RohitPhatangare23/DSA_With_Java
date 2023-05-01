package String;

public class _2_Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";
        String c = a;
        System.out.println(c == a);
        // ==
        System.out.println(a == b);

        //create diff objects for same value
        String name1 = new String("Kunal");
        String name2 = new String("Kunal");
//
        System.out.println(name1 == name2);  //== compairator

        System.out.println(name1.equals(name2));  //.equals is method
        System.out.println(name1.charAt(0));
        System.out.println(name1.indexOf("n"));

    }
}
