package Day16.ConstructorChaining;

public class SuperSuperClass extends SuperSuperSuperClass{

    public SuperSuperClass() {
        // invoke parent constructor using super keyword:
        super();
        System.out.println("Constructor of SuperSuperClass invoked");
    }
}
