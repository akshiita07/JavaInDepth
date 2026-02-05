package Day3;

public class primitiveDataTypesInt {
    byte age=20;
    short rank=165;
    int phone=1234567890;
    long mobile=987654231;

    int hex65=0x0041; //1+64
    int binary65=0b01000001; //1+2^6=1+64
    int octal65=0101; //1+8^3=65

    void compute(){
        System.out.println("Age: "+ age);
        System.out.println("Rank: "+ rank);
        System.out.println("Phone: "+ phone);
        System.out.println("Mobile: "+ mobile);
        System.out.println("Integer min value: "+ Integer.MIN_VALUE);
        System.out.println("Integer max value: "+ Integer.MAX_VALUE);
        System.out.println("Byte min value: "+ Byte.MIN_VALUE);
        System.out.println("Byte max value: "+ Byte.MAX_VALUE);
        System.out.println("Long min value: "+ Long.MIN_VALUE);
        System.out.println("Long max value: "+ Long.MAX_VALUE);
        System.out.println("hex65: "+ hex65);
        System.out.println("binary65: "+ binary65);
        System.out.println("octal65: "+ octal65);
    }

    public static void main(String[] args){
        primitiveDataTypesInt p=new primitiveDataTypesInt();
        p.compute();
    }

}
