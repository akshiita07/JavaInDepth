package Day14;

public class MathClass {

    private static void randomNumberGeneration() {
        // suppose we have 1 to 100 customers and we have to select 1 random as winner
        // Math.random() returns number between [0.0 and 1.0)
        // convert to int from double
        // multiply by 100 to get no between [0 to 100)
        // add 1 to get between [1 to 101) ie [1 to 100]
        int selectedCustomer=(int)((Math.random())*100)+1;
        System.out.println("Winner is customer: "+selectedCustomer);
    }

    private static void roundOff() {
        long n1=Math.round(24.45);
        int n2=Math.round(25.7f);
        System.out.println("n1: "+n1);
        System.out.println("n2: "+n2);

        //ceil:
        double n3=Math.ceil(24.45);
        double n4=Math.ceil(25.5);
        System.out.println("n3: "+n3);
        System.out.println("n4: "+n4);

        //floor():
        double n5=Math.floor(24.45);
        double n6=Math.floor(25.5);
        double n7=Math.floor(25.7);
        System.out.println("n5: "+n5);
        System.out.println("n6: "+n6);
        System.out.println("n7: "+n7);
    }

    private static void maxMinAbs() {
        int n1=Math.max(24,25);
        double n2=Math.max(24.4,24.9);
        int n3=Math.min(24,25);
        double n4=Math.min(24.4,24.9);
        double n5=Math.abs(-7.67);
        double n6=Math.abs(7.67);

        System.out.println("n1: "+n1);
        System.out.println("n2: "+n2);
        System.out.println("n3: "+n3);
        System.out.println("n4: "+n4);
        System.out.println("n5: "+n5);
        System.out.println("n6: "+n6);
    }

    private static void powers() {
        double n1=Math.pow(2.0,4.0);
        System.out.println("2^4: "+n1);

        double n2=Math.sqrt(16.0);
        System.out.println("sqrt(16): "+n2);
        double n22=Math.sqrt(-16.0);
        System.out.println("sqrt(-16): "+n22);

        double n3=Math.cbrt(8.0);
        System.out.println("cbrt(8): "+n3);
    }

    private static void logFunctions(){
        double n1=Math.log(100);
        double n2=Math.log10(100);
        System.out.println("Math.log(100): "+n1);
        System.out.println("Math.log10(100): "+n2);
    }

    private static void trigonoFunctions(){
        // sin/cos/tan takes radians
        // so convert degrees to radians using Math.toRadians
        System.out.println("sin 0deg: "+Math.sin(Math.toRadians(0))+" 30deg: "+Math.sin(Math.toRadians(30))+" 45deg: "+Math.sin(Math.toRadians(45))+" 60deg: "+Math.sin(Math.toRadians(60))+" 90deg: "+ Math.sin(Math.toRadians(90)));

        System.out.println("cos 0deg: "+Math.cos(Math.toRadians(0))+" 30deg: "+Math.cos(Math.toRadians(30))+" 45deg: "+Math.cos(Math.toRadians(45))+" 60deg: "+Math.cos(Math.toRadians(60))+" 90deg: "+ Math.cos(Math.toRadians(90)));

        System.out.println("tan 0deg: "+Math.tan(Math.toRadians(0))+" 30deg: "+Math.tan(Math.toRadians(30))+" 45deg: "+Math.tan(Math.toRadians(45))+" 60deg: "+Math.tan(Math.toRadians(60))+" 90deg: "+ Math.tan(Math.toRadians(90)));

        System.out.println("sin-1 0deg: "+Math.asin(Math.toRadians(0))+" 30deg: "+Math.asin(Math.toRadians(30))+" 45deg: "+Math.asin(Math.toRadians(45))+" 60deg: "+Math.asin(Math.toRadians(60))+" 90deg: "+ Math.asin(Math.toRadians(90)));

        System.out.println("cos-1 0deg: "+Math.acos(Math.toRadians(0))+" 30deg: "+Math.acos(Math.toRadians(30))+" 45deg: "+Math.acos(Math.toRadians(45))+" 60deg: "+Math.acos(Math.toRadians(60))+" 90deg: "+ Math.acos(Math.toRadians(90)));

        System.out.println("tan-1 0deg: "+Math.atan(Math.toRadians(0))+" 30deg: "+Math.atan(Math.toRadians(30))+" 45deg: "+Math.atan(Math.toRadians(45))+" 60deg: "+Math.atan(Math.toRadians(60))+" 90deg: "+ Math.atan(Math.toRadians(90)));

        System.out.println("sin hyperbolic 0deg: "+Math.sinh(Math.toRadians(0))+" 30deg: "+Math.sinh(Math.toRadians(30))+" 45deg: "+Math.sinh(Math.toRadians(45))+" 60deg: "+Math.sinh(Math.toRadians(60))+" 90deg: "+ Math.sinh(Math.toRadians(90)));

        System.out.println("cos hyperbolic 0deg: "+Math.cosh(Math.toRadians(0))+" 30deg: "+Math.cosh(Math.toRadians(30))+" 45deg: "+Math.cosh(Math.toRadians(45))+" 60deg: "+Math.cosh(Math.toRadians(60))+" 90deg: "+ Math.cosh(Math.toRadians(90)));

        System.out.println("tan hyperbolic 0deg: "+Math.tanh(Math.toRadians(0))+" 30deg: "+Math.tanh(Math.toRadians(30))+" 45deg: "+Math.tanh(Math.toRadians(45))+" 60deg: "+Math.tanh(Math.toRadians(60))+" 90deg: "+ Math.tanh(Math.toRadians(90)));
    }

    public static void main(String[] args) {
//        randomNumberGeneration();
//        roundOff();
//        maxMinAbs();
//        powers();
        logFunctions();
        trigonoFunctions();
    }

}
