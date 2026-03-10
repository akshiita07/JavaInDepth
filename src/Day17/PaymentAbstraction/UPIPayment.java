package Day17.PaymentAbstraction;

public class UPIPayment  extends Payment{

    public void pay(int amt){
        System.out.println("Paying "+amt+" through UPI");
    }
}
