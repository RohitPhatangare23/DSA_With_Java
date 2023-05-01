package access_control;

public class _3_subclass extends  _1_aa {
    public _3_subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        _1_aa obj = new _1_aa(45, "Kunal Kushwaha");
        int n = obj.num;

        //System.out.println(obj instanceof Object);
    }
}
class SubSubclass extends _3_subclass {

        public SubSubclass(int num, String name) {
            super(num, name);
        }

        public static void main(String[] args) {
            SubSubclass obj1 = new SubSubclass(45, "Kunal Kushwaha");
            int n = obj1.num;
        }
}

class SubClass2 extends _1_aa {

        public SubClass2(int num, String name) {
            super(num, name);
        }

        public static void main(String[] args) {
            SubClass2 obj = new SubClass2(45, "Kunal Kushwaha");
//        int n = obj.num;

            System.out.println(obj instanceof SubClass2 );
            System.out.println(obj instanceof _1_aa );
            System.out.println(obj instanceof Object );
//            System.out.println(obj instanceof SubSubclass );//ERORR
        }

}

