package Day10;

public class Strings {

    public static void printString(String s){
        System.out.println(s);
    }

    public static void stringOperations(){
        String s="Hello World!";

        System.out.println("s.equals(\"HeLLo WOrld!\") "+s.equals("HeLLo WOrld!"));
        System.out.println("s.equals(\"Hello World!\") "+s.equals("Hello World!"));

        System.out.println("s.equalsIgnoreCase()(\"HeLLo WOrld!\") "+s.equalsIgnoreCase("HeLLo WOrld!"));
        System.out.println("s.equalsIgnoreCase()(\"Hello World!\") "+s.equalsIgnoreCase("Hello World!"));

        System.out.println("s.compareTo(\"hello world\") "+s.compareTo("hello world"));
        System.out.println("s.compareTo(\"Hello World\") "+s.compareTo("Hello World!"));

        System.out.println("s.contains(\"Hi\") "+s.contains("Hi"));
        System.out.println("s.contains(\"Hello\") "+s.contains("Hello"));

        System.out.println("s.startsWith(\"H\") "+s.startsWith("H"));
        System.out.println("s.startsWith(\"ak\") "+s.startsWith("ak"));

        System.out.println("s.endsWith(\"!\") "+s.endsWith("!"));
        System.out.println("s.endsWith(\":\") "+s.endsWith(":"));

        System.out.println("s.indexOf(\"o\") "+s.indexOf("o"));
        System.out.println("s.indexOf(\" \") "+s.indexOf(" "));

        System.out.println("s.lastIndexOf(\"o\") "+s.lastIndexOf("o"));

        System.out.println("s.charAt(6) "+s.charAt(6));
        System.out.println("s.charAt(11) "+s.charAt(11));

        System.out.println("s.substring(4) "+s.substring(4));
        System.out.println("s.substring(4,10) "+s.substring(4,10));

        System.out.println("s.toUpperCase() "+s.toUpperCase());
        System.out.println("s.toLowerCase() "+s.toLowerCase());

        System.out.println("s.trim() "+s.trim());

        System.out.println("s.replaceAll(\"o\",\"i\") "+s.replaceAll("o","i"));

        //SPlit returns array of characters
        String[] c=s.split("o");
        System.out.println("\ns.split(\"o\") ");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }

        System.out.println("\nString.valueOf(6.7) "+String.valueOf(6.7));
    }

    public static void main(String[] args) {
        //NOT Recommended Methods:
        String s1=new String();
        //printString(s1);
        String s2=new String("Hello World");
        //printString(s2);
        // Recommended Methods:
        String s3="Recommended Method";
        //printString(s3);
        String s4="Hi"+"Akshita";
        //printString(s4);
        String s5="Akshita"+" "+"Pathak";
        printString(s5);

        System.out.println("Length of string s5 is: "+s5.length());
        System.out.println("s5 is empty? "+s5.isEmpty());

        stringOperations();

    }
}
