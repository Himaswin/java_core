package Jan17;

public class Cpayment implements Ipayment{

    @Override
    public void pay() {
        System.out.println("pay using credi");
    }

    @Override
    public void printDetails() {
        System.out.println("receipt printed");
    }
}
