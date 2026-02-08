package Day6;

public class Comparison {

    static boolean canVote(int age){
        if(age<18){
            return false;
        }else{
            return true;
        }
    }

    static void compareOperators(){
        System.out.println("21>0 : "+(21>0));
        System.out.println("21>=0 : "+(21>=0));
        System.out.println("21<0 : "+(21<0));
        System.out.println("21<=0 : "+(21<=0));
        System.out.println("21==0 : "+(21==0));
        System.out.println("21!=0 : "+(21!=0));
    }

    public static void main(String[] args) {
        int age=19;
        boolean yesVote=canVote(age);
        System.out.println("Age "+age+" can vote?: "+yesVote);
        age=11;
        yesVote=canVote(age);
        System.out.println("Age "+age+" can vote?: "+yesVote);
        compareOperators();
    }
}
