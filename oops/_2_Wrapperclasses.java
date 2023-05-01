package oops;

public class _2_Wrapperclasses {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
        //Integer num = 45;  //created as objects here num provides lots of properties
        // wrapper class is convert a premitive as object


        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

        /*
            final Keyword:
            A field can be declared as final. Doing so prevents its contents from being modified, making it, essentially, a constant.
            This means that you must initialize a final field when it is declared.

            It is a common coding convention to choose all uppercase identifiers for final fields:
            final int FILE_OPEN = 2;

            Unfortunately, final guarantees immutability only when instance variables are primitive types, not reference types.
            If an instance variable of a reference type has the final modifier, the value of that instance variable (the reference
            to an object) will never change—it will always refer to the same object—but the value of the object itself can change.
         */

//        final int BONOUS = 2;
//        BONOUS = 3;  //   it can't modifed

        final A kunal = new A("Kunal Kushwaha");
        System.out.println(kunal.name);
        kunal.name = "other name";
        System.out.println(kunal.name);

        // when a non primitive is final, you cannot reassign it.
//        kunal = new A("new object");

        A obj = new A("Rnadvsjhv");

        System.out.println(obj);

//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A("Random name");
//        }

    }

    static void swap(Integer a, Integer b) {
//        int  temp = a;
        Integer temp = a;
        a = b;
        b = temp;

        //still not swap
    }

}

        class A {
            final int num = 10;
            String name;

            public A(String name) {
                System.out.println("object created");
                this.name = name;
            }

            @Override
            protected void finalize() throws Throwable {
                System.out.println("Object is destroyed");
            }
        }

/*
        The finalize( ) Method:
        Sometimes an object will need to perform some action when it is destroyed.
        To handle such situations, Java provides a mechanism called finalization. By using finalization,
        you can define specific actions that will occur when an object is just about to be reclaimed by the garbage collector.
        To add a finalizer to a class, you simply define the finalize( ) method. The Java run time calls that method whenever
        it is about to recycle an object of that class. Right before an asset is freed, the Java run time calls the finalize( )
        method on the object.

        protected void finalize( ) {
            // finalization code here
        }

 */