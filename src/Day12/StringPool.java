package Day12;

public class StringPool {
    public static void main(String[] args) {
        // created using string literal:
        String s1="hello";
        String s2="hello";
        String s3="hello";

        // created using new keyword:
        String s4=new String("hello");
        String s="hel";
        String s5="lo";

        // final keyword used so directly replaced at compile time:
        final String s6="lo";

        System.out.println("s1==s2: " + (s1==s2));
        System.out.println("s2==s3: " + (s2==s3));
        System.out.println("s1==s4: " + (s1==s4));
        System.out.println("Using intern method: s1==s4.intern(): " + (s1==s4.intern()));
        System.out.println("s1==(s+s5): " + (s1==(s+s5)));
        System.out.println("s1==(s+s6): " + (s1==(s+s6).intern()));
    }
}
