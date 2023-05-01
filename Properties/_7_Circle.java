package Properties;

public class _7_Circle extends _6_Shape{
    // this will run when obj of Circle is created
    // hence it is overriding the parent method
     // this is called annotation
    double pi=3.14;
    int r=4;
    @Override // use for check purpose
    void area() {
        System.out.println("Area is pi * r * r"+pi*r*r);
    }
}
