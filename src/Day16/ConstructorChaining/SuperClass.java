package Day16.ConstructorChaining;

public class SuperClass extends SuperSuperClass{

    public SuperClass() {
        // invoke parent constructor using super keyword:
        super();
        System.out.println("Constructor of SuperClass invoked");
    }
}
