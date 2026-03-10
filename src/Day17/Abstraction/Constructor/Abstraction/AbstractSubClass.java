package Day17.Abstraction.Constructor.Abstraction;

public abstract class AbstractSubClass extends AbstractSuperClass {

    // constructor using super:
    protected AbstractSubClass(int incr1, int incr2) {
        super(incr1, incr2);
        System.out.println("In constructor of AbstractSubClass");
    }

    // implements only foo() method here:
     public int foo(){
         System.out.println("Foo method");
         return 10;
     }
}
