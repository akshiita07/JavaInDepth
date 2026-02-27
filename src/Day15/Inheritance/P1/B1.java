package Day15.Inheritance.P1;

import Day15.Inheritance.P2.C2;

public class B1 {
    public static void main(String[] args) {
//        System.out.println("Accessing package P1 private variable l thru A1"+A1.l); // cannot access pvt
        System.out.println("Accessing package P1 public variable l thru A1"+A1.m);
        System.out.println("Accessing package P1 default variable l thru A1"+A1.n);
        System.out.println("Accessing package P1 protected variable l thru A1"+A1.o);

//        System.out.println("Accessing package P1 private variable l thru C1"+C1.l);  // even tho inherits but cannot access pvt method of A1
        System.out.println("Accessing package P1 public variable l thru C1"+C1.m);
        System.out.println("Accessing package P1 default variable l thru C1"+C1.n);
        System.out.println("Accessing package P1 protected variable l thru C1"+C1.o);

//        System.out.println("Accessing package P2 private variable l thru C2"+C2.l);  // even tho inherits but cannot access pvt method of A1
        System.out.println("Accessing package P2 public variable l thru C2"+ C2.m);
//        System.out.println("Accessing package P2 default variable l thru C2"+C2.n); // cannot be access as diff package
        System.out.println("Accessing package P2 protected variable l thru C2"+C2.o);
    }
}
