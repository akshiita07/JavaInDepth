package Day2;

public class CurrencyConvertor {
    int ruppee=63;
    int dirham=3;
    int real=3;
    int chilean_peso=595;
    int mexican_peso=18;
    int _yen=107;
    int $austrailia=2;
    int dollar;
    int Ruppee=63;

    void printCurrencies(){
        System.out.println("ruppee: "+ruppee);
        System.out.println("dirham: "+dirham);
        System.out.println("real: "+real);
        System.out.println("chilean_peso: "+chilean_peso);
        System.out.println("mexican_peso: "+mexican_peso);
        System.out.println("_yen: "+_yen);
        System.out.println("$austrailia: "+$austrailia);
        System.out.println("dollar: "+dollar);
        System.out.println("Ruppee: "+Ruppee);
    }

    public static void main(String[] args){
        CurrencyConvertor c=new CurrencyConvertor();
        c.printCurrencies();
    }
}
