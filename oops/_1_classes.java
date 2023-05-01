package oops;

import java.util.Arrays;

public class _1_classes {
    public static void main(String[] args) {
//        int[] roll=new int[5];
//        String[] name=new String[5];
//        float[] marks=new float[5];
        /*
        A class is a template for an object, and an object is an instance of a class.
        A class creates a new data type that can be used to create objects.

        When you declare an object of a class, you are creating an instance of that class.
        Thus, a class is a logical construct. An object has physical reality. (That is, an object occupies space in memory.)

        Objects are characterized by three essential properties: state, identity, and behavior.
        The state of an object is a value from its data type. The identity of an object distinguishes one object from another.
        It is useful to think of an object’s identity as the place where its value is stored in memory.
        The behavior of an object is the effect of data-type operations.
         */

        //Using classes create your own data type
        //objects are stored in heap memory
        //refrence variable stored in stack memory
        Student[] info = new Student[5];

        //just declaring
        Student ritik;

        //rohit.roll(); //error = Variable 'rohit' might not have been initialized
        System.out.println(Arrays.toString(info));

        /*
        The dot operator links the name of the object with the name of an instance variable.
        Although commonly referred to as the dot operator, the formal specification for Java categorizes the . as a separator.
        The 'new' keyword dynamically allocates(that is, allocates at run time)memory for an object & returns a reference to it.
        This reference is, more or less, the address in memory of the object allocated by new.
        This reference is then stored in the variable.
        Thus, in Java, all class objects must be dynamically allocated.
         */

        Student rohit = new Student();
//        rohit.roll=23;                  //if u will not give this it will take default one
//        rohit.name="Rohit Phatangare";
//        rohit.marks=89.45f;
//
//        System.out.println(rohit);         //oops.Student@6d03e736
        System.out.println(rohit.roll);    //0            //by default internal java implementaion without pass vlaue
        System.out.println(rohit.name);    // null
        System.out.println(rohit.marks);   // 0.0

        rohit.greeting();
//        rohit.changeName("Mrunal Phatangare");
        rohit.greeting();

        //--------------------------------- part 2 ---------------------------------------------

        part2 mukesh=new part2(15,"Mukseh",78.6f);
        System.out.println(mukesh.roll);
        System.out.println(mukesh.name);
        System.out.println(mukesh.marks);

        Student random = new Student(rohit);
        System.out.println(random.name);

        //------------------------------ part 3   --------------------------------------------

        //ranndom2 is refrence variable
        part3 random2=new part3();
        System.out.println(random2.name);

        part3 one = new part3();
        part3 two = one;

        one.name = "Something something";

        System.out.println(two.name);

    }
}


        //create class
        //for every single student

        class Student {
            int roll=56;   //default value if you not parse
            String name;
            float marks;

            // we need a way to add the values of the above
            // properties object by object

            // we need one word to access every object

            /*
            The this Keyword:
            Sometimes a method will need to refer to the object that invoked it. To allow this, Java defines the this keyword.
            this can be used inside any method to refer to the current object. That is, this is always a reference to the object on
            which the method was invoked.
             */

            /*
            Constructors:

            Once defined, the constructor is automatically called when the object is created, before the new operator completes.
            Constructors look a little strange because they have no return type, not even void.
            This is because the implicit return type of a class’ constructor is the class type itself.
            this are new keyword to create objects in memory

            In the line
            Box mybox1 = new Box();
            new Box( ) is calling the Box( ) constructor.
             */

            Student(){
                this.roll=45;
                this.name="Rohit Phatangare";
                this.marks=90.5f;
            }
            //here this keyword replacing with refrence variable rohit internally it's rohit.roll

            void greeting() {
                System.out.println("Hello! My name is " + this.name);
            }
            void changeName(String name ) {
                this.name = name ;
                //this.name = naam;  //by convation use as same
                //name = namm;    // it's same use want you sutable
            }

            Student  (Student other) {
                this.roll = other.roll;
                this.name = other.name;
                this.marks = other.marks;
            }


        }

        //------------------------------ part 2-------------------------

        class part2{
            int roll;
            String name;
            float marks=60.0f;  // default value if  you not psss it will take .
            // variable name and inside para,ter name is always diff a but it's same then add this.variable name

            // Student arpit = new Student(17, "Arpit", 89.7f);
            // here, this will be replaced with arpit
            part2(int rno,String name , float marks){
                // roll -> 15 , this.roll->roll->15
                this.roll=rno;     //this add kiya to bhi chalega if diffrent name
                this.name=name;
                this.marks=marks;
            }


        }

        //------------------------------ part 3-------------------------

        class  part3{
            int roll;
            String name;
            float marks=60.0f;  // default value if  you not psss it will take .

            part3(){
                // this is how you call a constructor from another constructor
                // internally: new Student (13, "default person", 100.0f);
                this(78,"default person",55.4f);

            }
            part3(int rno,String name , float marks){
                // roll -> 15 , this.roll->roll->15
                this.roll=rno;     //this add kiya to bhi chalega if diffrent name
                this.name=name;
                this.marks=marks;
            }
        }
