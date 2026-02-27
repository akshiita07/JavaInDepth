package Day15.Inheritance.P2;

import Day15.Inheritance.P1.A1;

public class C2 extends A1 {
    // C2 also inherits A1
    public static void main(String[] args) {

//        System.out.println("Accessing package P1 private variable l thru A1"+A1.l); // even tho inherits but cannot access pvt method of A1
        System.out.println("Accessing package P1 public variable l thru A1"+A1.m);
//        System.out.println("Accessing package P1 default variable l thru A1"+A1.n); // cannot access default variable as NOT in same package
        System.out.println("Accessing package P1 protected variable l thru A1"+A1.o); // part of same family so can access protetcted var

    }
}
