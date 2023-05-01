package Properties;

/*
# Using final to Prevent Inheritance:
Sometimes you will want to prevent a class from being inherited. To do this, precede the class declaration with final.
NOTE: Declaring a class as final implicitly declares all of its methods as final, too.
As you might expect, it is illegal to declare a class as both abstract and final since an abstract class is incomplete
by itself & relies upon its subclasses to provide complete implementations.
 */
//public final class _1_Box
public  class _1_Box {
    /*
    Although a subclass includes all of the members of its superclass, it cannot access those members of the superclass
    that have been declared as private.
     */
    //private double l;  // u can only use in this file
    private double l;
    double h;
    double w;
    double weight;

    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    public double getL() {
        return l;
    }

    _1_Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    _1_Box (double side) {
        //super(); //Object class  {Every class has {@code Object} as a superclass.}
        this.w = side;
        this.l = side;
        this.h = side;
    }

    _1_Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    _1_Box(_1_Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    public  void information(){
        System.out.println("Running the Box");
    }
}
