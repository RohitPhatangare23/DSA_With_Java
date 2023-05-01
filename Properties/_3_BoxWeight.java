package Properties;

import java.util.ArrayList;

public class _3_BoxWeight extends _1_Box {
    double weight;

    public _3_BoxWeight() {
        this.weight = -1;

    }
    //    @Override   //static method can be inherited but can not be overriden
    //overrinfing depends on object stastic stuff does not depend on object hemce u can't override stastic methods
    // because inorder stastic somthingu have to deal with objects  stastic stuff elemenet objects hence u can't override
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
        ArrayList list = new ArrayList();
    }

    _3_BoxWeight (_3_BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    _3_BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    /*
        Using super:
        Whenever a subclass needs to refer to its immediate superclass, it can do so by use of the keyword super.
        super has two general forms. The first calls the superclass’ constructor.
        The second is used to access a member of the superclass that has been hidden by a member of a subclass.

     */

    public _3_BoxWeight(double l, double h, double w, double weight) {
        //Call to 'super()' must be first statement in constructor body

        // parent class do not care about what child class conatin. but child class care what parent class contain
        super(l, h, w); // what is this? call the parent class constructor
        // used to initialise values present in parent class
//        System.out.println(this.w);
        System.out.println(super.weight); //explicitly want use parent class variable use super(weight is present in parent and child class)
        this.weight = weight;

        //super(l, h, w);      //ERROR
        /*
        super( ) always refers to the constructor in the closest superclass. The super( ) in BoxPrice calls the constructor in
        BoxWeight. The super( ) in BoxWeight calls the constructor in Box. In a class hierarchy, if a superclass constructor
        requires parameters, then all subclasses must pass those parameters “up the line.” This is true whether or not a
        subclass needs parameters of its own.

        If you think about it, it makes sense that constructors complete their execution in order of derivation.
        Because a superclass has no knowledge of any subclass, any initialization it needs to perform is separate from and
        possibly prerequisite to any initialization performed by the subclass. Therefore, it must complete its execution first.

        NOTE: If super( ) is not used in subclass' constructor, then the default or parameterless constructor of each superclass
        will be executed.
         */
    }



}
