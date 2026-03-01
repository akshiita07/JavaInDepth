package Day16.ConstructorChaining;

public class Main {

    public static void main(String[] args) {
        SubClass s=new SubClass();
        // invokes subclass constructor ->invokes superClass constructor ->invokes SuperSuperClass constructor ->invokes SuperSuperSuperClass constructor
    }
}
