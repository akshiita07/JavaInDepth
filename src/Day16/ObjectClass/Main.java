package Day16.ObjectClass;

public class Main {

    public static void main(String[] args) {
        User u1=new User(7);
        // 1. toString() method
        System.out.println(u1.toString());

        // 2. hashCode() method
        Staff s1=new Staff(7,5);
        Staff s2=new Staff(7,5);
        System.out.println("Hash code of s1 staff object= "+s1.hashCode());
        System.out.println("Hash code of s2 staff object= "+s2.hashCode());

        // 3.getClass() method
        System.out.println(s1.getClass());

        //4. equals()
        User u2=new User(7);
        System.out.println("Checking if u1 equals u2 with same id: "+u1.equals(u2)); //overridden method
        User u3=new User(2);
        System.out.println("Checking if u1 equals u3: "+u1.equals(u3));
    }
}
