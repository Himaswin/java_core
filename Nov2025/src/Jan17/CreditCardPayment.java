package Jan17;

public class CreditCardPayment extends Payment{

    @Override
    void pay() {
        System.out.println("paying via credit");
    }
}

class UpiPayment extends Payment{


    @Override
    void pay(){
        System.out.println("Paying using UPI");
    }
}

class Main{
    public static void main(String[] args) {
        Payment cp = new CreditCardPayment(); // upcasting - reference parent type obj child
        cp.pay();
    }
}


