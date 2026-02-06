package Day4;

public class TypesOfStatements {
    //1. Decalration:
    static int cnt=1;

    //3. Invocation:
    void getCount(){
        System.out.println("Count is= "+cnt);
    }

    public static void main(String[] args){
        TypesOfStatements s1=new TypesOfStatements();
        //2. Assignemnt:
        cnt=9;
        //3. Invocation:
        s1.getCount();
        //4. Increment:
        cnt++;
        //5. Control flow:
        if(cnt<10){
            System.out.println("Count is less than 10");
        }else{
            System.out.println("Count is more/equal than 10");
        }
        //3. Invocation:
        s1.getCount();
    }
}
