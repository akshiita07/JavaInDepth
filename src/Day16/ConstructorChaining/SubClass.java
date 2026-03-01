package Day16.ConstructorChaining;

public class SubClass extends SuperClass{

    public SubClass() {
        // invoke parent constructor using super keyword:
        super();
        System.out.println("Constructor of SubClass invoked");
    }
}
