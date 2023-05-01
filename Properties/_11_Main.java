package Properties;

public class _11_Main {
    public static void main(String[] args) {

        //parent() obj=new child()
        //here which method will called it's depend on child() this is known as upcasting how works is known as overrinding
        _6_Shape shape=new _6_Shape();
        _7_Circle circle=new _7_Circle();
        _8_Triangle triangle=new _8_Triangle();
        _9_Square square=new _9_Square();
        _6_Shape square2=new _9_Square();
        square.area();
        square2.area();
        shape.area();
        triangle.area();

        /*
        Q how java dertermine this
        =>It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime
         */
    }
}
