package Jan13;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        System.out.println(ba.showBalance());
        ba.deposit(50);
        System.out.println(ba.showBalance());
        ba.withdrawl(20);
        System.out.println(ba.showBalance());
        ba.deposit(-5);
        ba.withdrawl(-4);
        System.out.println(ba.showBalance());
    }
}
