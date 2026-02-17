package Jan13;

public class BankAccount {


    private int balance;

    void deposit(int amount){
        if(amount <= 0){
            System.out.println("please enter a valid deposit");
        }else{
            balance += amount;
            System.out.println("your amount " + amount +" is deposited");
        }

    }
    void withdrawl(int amount){
        if(amount <= 0){
            System.out.println("Please select valid amount to withdraw");
        }else{
            balance-=amount;
            System.out.println("Your amount " + amount+" is withDrawn");
        }
    }
    int showBalance(){
        return this.balance;

    }
}
