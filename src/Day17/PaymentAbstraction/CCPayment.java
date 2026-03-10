package Day17.PaymentAbstraction;

public class CCPayment extends Payment{

    public void pay(int amt){
        System.out.println("Paying "+amt+" through credit card");
    }
}
