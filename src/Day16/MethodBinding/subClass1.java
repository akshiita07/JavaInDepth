package Day16.MethodBinding;

public class subClass1 extends superClass{

    // static method:
    public static void A(){
        System.out.println("subClass1 static method A");
    }
    // instance method:
    public void B(){
        System.out.println("subClass1 instance method B");
    }
}
