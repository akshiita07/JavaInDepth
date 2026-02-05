package Day3;

public class primitiveDataTypesCharBool {
    char degree='B';
    char hex65=0x0041; //1+64
    char binary65=0b01000001; //1+2^6=1+64
    char int65=65;

    boolean isMale=false;
    boolean isFemale=true;

    boolean isInternational=true;
    boolean isIndian;
    int tuitionFee=1200;
    int internationalFees=2200;

    void compute(){
        System.out.println("degree is: "+ degree);

        System.out.println("Char min value: "+ '\u0000');
        System.out.println("Char max value: "+ '\uFFFF');
        System.out.println("char int65: "+ int65);
        System.out.println("char hex65: "+ hex65);
        System.out.println("char binary65: "+ binary65);

        System.out.println("isMale?: "+ isMale);
        System.out.println("isFemale?: "+ isFemale);

        if(isInternational){
            tuitionFee+=internationalFees;
        }
        System.out.println("Your fees is= "+ tuitionFee);


        if(isIndian){
            tuitionFee=100;
        }
        System.out.println("Your fees is= "+ tuitionFee);
    }

    public static void main(String[] args){
        primitiveDataTypesCharBool p=new primitiveDataTypesCharBool();
        p.compute();
    }
}
