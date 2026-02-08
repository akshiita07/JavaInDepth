package Day6;

public class Arithmetic {

    static void prePost(){
        System.out.println("\nPost inc:");
        int x=5;
        int y=x++;
        System.out.println( "x= : "+x);
        System.out.println( "y= : "+y);
        System.out.println("\nPre inc:");
        x=5;
        y=++x;
        System.out.println( "x= : "+x);
        System.out.println( "y= : "+y);
    }

    static void compoundOperations(int x){
        System.out.println("\nCompound arithmetic:");
        System.out.println( "x+=5 : "+(x+=5));
        System.out.println( "x-=5 : "+(x-=5));
        System.out.println( "x*=5 : "+(x*=5));
        System.out.println( "x/=5 : "+(x/=5));
        System.out.println( "x%=5 : "+(x%=5));
    }

    static void isOddOrEven(int x){
        if(x%2==0){
            System.out.println(x+" is Even");
        }else{
        System.out.println(x+" is Odd");

        }
    }

    public static void main(String[] args){
        int x=4;
        int y=2;
        System.out.println("Basic arithmetic:");
        System.out.println(x+" + "+y+" = "+(x+y));
        System.out.println(x+" - "+y+" = "+(x-y));
        System.out.println(x+" * "+y+" = "+(x*y));
        System.out.println(x+" / "+y+" = "+(x/y));
        System.out.println(x+" % "+y+" = "+(x%y));
        compoundOperations(100);
        prePost();
        isOddOrEven(7);
        isOddOrEven(120);
        System.out.println("Char addition: A+B= "+('A'+'B'));
        System.out.println("Char ascii: 'a'= "+('a'+0));
    }
}
