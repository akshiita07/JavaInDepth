package Day14;

public class BoxedPrimitives {

    public static void main(String[] args) {
        // creation of boxed primitives:
        Integer b1=Integer.valueOf(7);
        Integer b1more=Integer.valueOf("7");
        Boolean b2=Boolean.valueOf(false);
        Character b3=Character.valueOf('s');
        Double b4=Double.valueOf(7.67);

        // un-wrapping of boxed primitives:
        int ub1=b1.intValue();
        System.out.println("Un-wrpped int= "+ub1);
        int ub1more=b1more.intValue();
        System.out.println("Un-wrpped int2= "+ub1more);
        boolean ub2=b2.booleanValue();
        System.out.println("Un-wrpped bool= "+ub2);
        char ub3=b3.charValue();
        System.out.println("Un-wrpped char= "+ub3);
        double ub4=b4.doubleValue();
        System.out.println("Un-wrpped double= "+ub4);

        Character c1= Character.valueOf('a');
        Character c2= Character.valueOf('S');
        System.out.println("Character.isUpperCase(c1) "+Character.isUpperCase(c1));
        System.out.println("Character.isUpperCase(c2) "+Character.isUpperCase(c2));
        System.out.println("Character.isLetter(c1) "+Character.isLetter(c1));
        Character c3= Character.valueOf('7');
        System.out.println("Character.isDigit(c1) "+Character.isDigit(c1));
        System.out.println("Character.isDigit(c3) "+Character.isDigit(c3));
        System.out.println("Character.isLetterOrDigit(c1) "+Character.isLetterOrDigit(c1));

        Double d1=Double.valueOf(0.0/0.0);
        System.out.println("Is nan d1? "+Double.isNaN(d1));

        Integer i1=Integer.valueOf(8);
        System.out.println("Binary representation of 8= "+Integer.toBinaryString(i1));
        System.out.println("Int to string of 8= "+Integer.toString(i1));
    }
}
