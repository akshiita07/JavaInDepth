package Day17.Abstraction.Constructor.Abstraction;

public class ConcreteSubClass extends AbstractSubClass {

    // constructor using super:
    protected ConcreteSubClass(int incr1, int incr2) {
        super(incr1, incr2);
        System.out.println("In constructor of ConcreteSubClass");
    }

    // implements only bar() method here:
    public int bar(){
        System.out.println("Bar method");
        return 20;
    }

    public static void main(String[] args) {
        //create object:
        ConcreteSubClass obj=new ConcreteSubClass(1,2);
        obj.foo();
        obj.bar();
        obj.compute();
    }
}
