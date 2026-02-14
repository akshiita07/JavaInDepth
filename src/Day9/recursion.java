package Day9;

public class recursion {

    public static int findFactorial(int n){
        if(n<=1){
            return 1;
        }
        return n*findFactorial((n-1));
    }

    public static void main(String[] args) {
        int fact=findFactorial(4);
        System.out.println("Factorial of 4 is "+fact);
    }
}
