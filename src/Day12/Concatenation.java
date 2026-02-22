package Day12;

public class Concatenation {
    public static void main(String[] args) {
        String s="hello"+"world";
        System.out.println("Concatenation using +: "+s);

        StringBuilder sb=new StringBuilder();
        sb.append("hi").append(" ").append("aki");
        System.out.println("Using string builder: "+sb.toString());

        //Operations on string builder:
        System.out.println("sb.length(): "+sb.length());

        sb.replace(1,2,"ey");
        System.out.println("sb: "+sb);
        System.out.println("sb.length(): "+sb.length());

        sb.delete(1,sb.length());
        System.out.println("sb: "+sb);
        System.out.println("sb.length(): "+sb.length());

        sb.insert(1,"ey");
        System.out.println("sb: "+sb);
        System.out.println("sb.length(): "+sb.length());

        sb.reverse();
        System.out.println("sb: "+sb);
        System.out.println("sb.length(): "+sb.length());
    }
}
