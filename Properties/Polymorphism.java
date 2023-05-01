package Properties;

import java.util.Collection;

public class Polymorphism {
    //poly=many , morphisam = way to represend
    //act in reperesented in mutiple ways

    //NOTE : Polymorphism does not apply to instance variables.
    //data hiding is focus on data sequrity
    //encapsulation fous on hifing the complexity of system
    //is a geeters and setters




    /*
    Collections ==
    Enum=
        this are enum constant
        public ,static,and final
        since it's final you can create child enums
        types week
     */



    enum week{
        monday,tuesday,wednesday,thursday,friday,saturday,sunday;

        week() {
            System.out.println("constructor called for "+ this.toString());
        }
        //this is not public or protected  only private and default
        // why? we dont want to create new objects
        // this is not the enum concept, thats why

        // internally: public static final Week Monday = new Week()
    }
    public static void main(String[] args) {
        week we;
        we=week.monday;
//        for (week day:week.values()){
//            System.out.println(day);
//        }
        System.out.println(we);
        System.out.println(we.ordinal());
    }
}
