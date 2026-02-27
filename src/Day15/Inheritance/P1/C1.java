package Day15.Inheritance.P1;

public class C1 extends A1{
    // C1 extends A1:
    public static void main(String[] args) {
//        System.out.println("Accessing package P1 private variable l thru A1"+A1.l); // even tho inherits but cannot access pvt method of A1
        // can access all others:
        System.out.println("Accessing package P1 public variable l thru A1"+A1.m);
        System.out.println("Accessing package P1 default variable l thru A1"+A1.n);
        System.out.println("Accessing package P1 protected variable l thru A1"+A1.o);
    }
}
