package Day17.Interfaces;

public class CCPayment implements Payment {
    public void pay(int amt){
        System.out.println("Paying "+amt+" through credit card");
    }
}
