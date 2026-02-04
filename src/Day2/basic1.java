package Day2;

public class basic1 {
    static void typesOfPrint(){
        System.out.println("Hello");
        // cursor goes to next line
        System.out.print("World");
        // cursor stays on SAME line
        System.out.println("Hello");
        // cursor goes to next line
        System.out.print("\n\nAkiii");
    }

    static void arithmeticOperations(){
        int i=4;
        int j=2;
        System.out.println("Add: "+ (i+j));
        System.out.println("Subtract: "+ (i-j));
        System.out.println("Multiply: "+ (i*j));
        System.out.println("Divide: "+ (i/j));
        System.out.println("Modulo: "+ (i%j));
    }

    public static void main(String[] args){
        typesOfPrint();
        arithmeticOperations();
    }

}
