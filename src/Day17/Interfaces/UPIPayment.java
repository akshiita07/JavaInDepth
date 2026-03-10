package Day17.Interfaces;

public class UPIPayment  implements Payment {

    public void pay(int amt){
        System.out.println("Paying "+amt+" through UPI");
    }
}
