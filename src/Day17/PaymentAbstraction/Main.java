package Day17.PaymentAbstraction;

public class Main {

    public static void main(String[] args) {
        Payment p1=new CCPayment();
        p1.pay(70);
        Payment p2=new UPIPayment();
        p2.pay(1000);
    }
}
