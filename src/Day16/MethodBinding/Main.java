package Day16.MethodBinding;

public class Main {

    static void fnc1(superClass s){
        // for all methods: A() will run for superClass method
        // for B: object class method will be invoked
        s.A();
        s.B();
    }

    static void fnc2(subClass1 s){
        // for all methods: A() will run for subClass1 method
        // for B: object class method will be invoked
        s.A();
        s.B();
    }

    public static void main(String[] args) {
        superClass s1=new subClass1();
        fnc1(s1);
        superClass s2=new subClass2();
        fnc1(s2);
        superClass s3=new subClass3();
        fnc1(s3);

        subClass1 s4=new subClass1();
        fnc2(s4);
    }
}
