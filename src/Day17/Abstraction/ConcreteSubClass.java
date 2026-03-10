package Day17.Abstraction;

public class ConcreteSubClass extends AbstractSubClass{

    // implements only bar() method here:
    public void bar(){
        System.out.println("Bar method");
    }

    public static void main(String[] args) {
        //create object:
        ConcreteSubClass obj=new ConcreteSubClass();
        obj.foo();
        obj.bar();
    }
}
