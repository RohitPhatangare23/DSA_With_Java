package Properties;

public class _6_Shape {
    void area() {
        System.out.println("I Am in Shape");
    }


//    final void area() {
//        System.out.println("I Am in Shape");
//    }

    /*
    # Using final to Prevent Overriding:
    To disallow a method from being overridden, specify final as a modifier at the start of its declaration.
    Methods declared as final cannot be overridden.
    Methods declared as final can sometimes provide a performance enhancement: The compiler is free to inline calls to them
    because it “knows” they will not be overridden by a subclass. When a small final method is called, often the Java
    compiler can copy the bytecode for the subroutine directly inline with the compiled code of the calling method, thus
    eliminating the costly overhead associated with a method call. Inlining is an option only with final methods.
    Normally, Java resolves calls to methods dynamically, at run time. This is called late binding. However, since final
    methods cannot be overridden, a call to one can be resolved at compile time. This is called early binding.

     */
}
