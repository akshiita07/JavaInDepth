package Day14;

public class finalAndConstantVariables {

    public static void main(String[] args) {
        final String s1="Hello";
        final String s2="Hello"+"World";
        final int n1=7;
        final double n2=7.77;
        findMonth(2);
    }

    private static void findMonth(int month) {
        // both have to be final as case takes constant variable only:
        final int month2=2;
        final int month3=3;
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case month2:
                System.out.println("February");
                break;
            case month3:
                System.out.println("March");
                break;
            default:
                System.out.println("Wrong");
                break;

        }
    }
}
