package Properties;

public class Inheritence {
    public static void main(String[] args) {
        //child class is inheriteing properties of base class

        /*
        1) Single Inheritence = one class can extends another class   (Box -> boxWeight)
        2) Multilevel Inheritence = one class can inherit from derived class and derived class become parent class for another new class  (Box -> boxWeight - > boxPrice)
        3) Multiple  Inheritence = one class can extending more than one class (A->C, B->C) (not alowed in java)
        4) Hierarchial Inheritance = one class can inherited by many class ( A -> B,A -> C,A -> D)
        5) Hybrid Inheritance = Combination of Single and  Multiple Inheritence (A->B,C -> D)(not alowed in java)

        //Class can not be OWN Superclass
         */
    }

    class Base{
         int length=89;
         int width;
         int height;
    }
    class child extends Base{
        child ch=new child();   //initialize parent class also


    }
}
