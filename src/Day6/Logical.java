package Day6;

public class Logical {
    static boolean canBuy(int age,int salary){
        if(age>18 && salary>1_00_000){
            System.out.println("With salaray "+salary+" and age "+age+ " : CAN BUY");
            return true;
        }else{
            System.out.println("With salaray "+salary+" and age "+age+ " : CANNOT BUY");
            return false;
        }
    }


    static boolean canLoan(int age,int salary,boolean inDebt){
        if(age>18 && salary>1_00_000 && !inDebt){
            System.out.println("With salaray "+salary+" and age "+age+ " and not in debt: CAN LOAN");
            return true;
        }else{
            System.out.println("With salaray "+salary+" and age "+age+ " : CANNOT LOAN");
            return false;
        }
    }

    static void logicalOperators(){
        System.out.println("false&&false : "+(false&&false));
        System.out.println("false&&true : "+(false&&true));
        System.out.println("true&&false : "+(true&&false));
        System.out.println("true&&true : "+(true&&true));
        System.out.println("false||false : "+(false||false));
        System.out.println("false||true : "+(false||true));
        System.out.println("true||false : "+(true||false));
        System.out.println("true||true : "+(true||true));
        System.out.println("!false : "+(!false));
        System.out.println("!true : "+(!true));
    }

    public static void main(String[] args) {
        logicalOperators();
        canBuy(20,1_10_000);
        canBuy(12,1_10_000);
        canBuy(30,50_000);
        canLoan(10,80_000,false);
        canLoan(20,1_80_000,false);
        canLoan(20,1_80_000,true);
    }
}
