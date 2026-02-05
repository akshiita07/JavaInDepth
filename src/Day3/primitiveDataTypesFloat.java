package Day3;

import java.math.BigDecimal;

public class primitiveDataTypesFloat {
    float pi=3.14f;
    float gpa=9.4f;
    double piFull=3.1415926535;
    double scientific=6.7e10;

    void compute(){
        System.out.println("pi: "+ pi);
        System.out.println("gpa: "+ gpa);
        System.out.println("piFull: "+ piFull);
        System.out.println("scientific: "+ scientific);
        System.out.println("Float min value: "+ Float.MIN_VALUE);
        System.out.println("Float max value: "+ Float.MAX_VALUE);
        System.out.println("Double min value: "+ Double.MIN_VALUE);
        System.out.println("Double max value: "+ Double.MAX_VALUE);

        //Pitfalls of floating:
        System.out.println("0.1+0.2= "+ (0.1+0.2));
        System.out.println("1-0.9= "+ (1-0.9));
    // to avoid:
        BigDecimal obj1=new BigDecimal("0.1");
        BigDecimal obj2=new BigDecimal("0.2");
        System.out.println("using bigdecimal 0.1+0.2= "+ (obj1.add(obj2)));


    }

    public static void main(String[] args){
        primitiveDataTypesFloat p=new primitiveDataTypesFloat();
        p.compute();
    }
}
