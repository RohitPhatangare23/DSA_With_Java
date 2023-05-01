package Properties;

public class _2_Main {
    public static void main(String[] args) {
        _1_Box  box = new _1_Box(4.2,5.7,9.4);
//        System.out.println(box.l+ " " + box.h+" "+box.w);      // 4.2 5.7 9.4

        _1_Box box2 = new _1_Box();
//        System.out.println(box2.l+ " " + box2.h+" "+box2.w);   // -1.0 -1.0 -1.0

        _3_BoxWeight box3 = new _3_BoxWeight();
        System.out.println(box3.h + " " + box3.weight);  // -1.0 -1.0

        _3_BoxWeight box4 = new _3_BoxWeight(2, 3, 4, 8);
        System.out.println(box4.h + " " + box4.weight);  //   3.0 8.0

        /*
        A Superclass Variable Can Reference a Subclass Object:
        It is important to understand that it is the type of the reference variable—not the type of the object that it refers
        to—that determines what members can be accessed.
        When a reference to a subclass object is assigned to a superclass reference variable, you will have access only to
        those parts of the object defined by the superclass.

        plainbox      =  weightbox;
        (superclass)     (subclass)

        SUPERCLASS ref = new SUBCLASS();    // HERE ref can only access methods which are available in SUPERCLASS
         */
        _1_Box box5 = new _3_BoxWeight(2, 3, 4, 8);
        System.out.println(box5.w); //4

        /*
         there are many variables in both parent and child classes
         you are given access to variables that are in the ref type i.e. BoxWeight
         hence, you should have access to weight variable
         this also means, that the ones you are trying to access should be initialised
         but here, when the obj itself is of type parent class, how will you call the constructor of child class
         this is why error
         */
//        _3_BoxWeight box6 = new _1_Box(2, 3, 4);       //ERROR
//        System.out.println(box6);

        _4_boxPrice boxPrice=new _4_boxPrice(5,8,200);

        _1_Box.greeting();  //via the class name

        _3_BoxWeight box9 = new _3_BoxWeight();
        _3_BoxWeight.greeting(); // you can inherit but you cannot override

        box.getL();
    }







}

