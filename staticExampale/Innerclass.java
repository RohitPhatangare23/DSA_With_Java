package staticExampale;
//outside classes can not be stastic , it self not dependent on any other class
//only Inner  classes can  be stastic , class test depend on Innerclass
public class Innerclass {
    static class Test {
         String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
       public String toString() {   // rohit
            return name;
       }
    }

    public static void main(String[] args) {
        Test a = new Test("rohit");
        Test b = new Test("Rahul");

        System.out.println(a);

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//static class A {
//
//}

