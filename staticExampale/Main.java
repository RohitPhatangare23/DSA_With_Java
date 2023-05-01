package staticExampale;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal", 10000, false);
        Human rahul = new Human(34, "Rahul", 15000, true);
        Human arpit = new Human(34, "arpit", 15000, true);

        System.out.println(kunal.name);

        //System.out.println(kunal.population);  //1   without static keyword it gives 1
        // accessing / more defiening don't do it via access varaible it will work but still don't do it use it class name
        System.out.println(Human.population);  //1   without static keyword it gives 1
        System.out.println(Human.population);  //1
        System.out.println(Human.population);

        /*
        1) When a member is declared static, it can be accessed before any objects of its class are created,
        and without reference to any object. You can declare both methods and variables to be static.
        The most common example of a static member is main( ).
        main( ) is declared as static because it must be called before any objects exist.
        Static method in Java is a method which belongs to the class and not to the object.
        2) you can declare both the methods & variable is static
         */

        //static is use this thing you can use main function without creating object of that class
        // before any object is created it should alow to run main that's y it's staitc


        //greeting(); //inside static method you can't use any thing which in non-stastic


        //fun();

        Main funn = new Main();
        funn.fun2();


    }


    // we know that something which is not static, belongs to an object
     void greeting() {
//        fun();
        System.out.println("Hello world");
    }

    // this is not dependent on objects
    static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();


    }
    void fun2() {
        greeting();
    }



}
