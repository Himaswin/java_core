package Jan17;

public class TdBank extends BankOfCanada{

    @Override
    double calculateInterest() {
        return primeRate + .99;
    }
}
