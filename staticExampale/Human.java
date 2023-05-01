package staticExampale;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void welcome() {
        System.out.println("Hello world");
//        System.out.println(this.age); // cant use this over here
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        //this.population +=1;   // this represents objects; it's give same answer but give warring
        //for better convention use class name
        Human.population +=1;   // inorderd to acces static variable you just the use class name

        Human.welcome();
    }
}
