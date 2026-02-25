package Jan17;

public class BankMain {

    public static void main(String[] args) {
        BankOfCanada boc = new TdBank();
//        System.out.println(boc.calculateInterest());
//        BankOfCanada boc1 = new BankofCanada(); - cannot do this

        Employee emp = new FullTimeEmployee(121, "bro");


        Ipayment pay = new Cpayment();

        pay.pay();
        pay.printDetails();

    }
}
