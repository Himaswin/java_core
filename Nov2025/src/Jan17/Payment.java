package Jan17;

public abstract class Payment {
    abstract void pay();

    void printReceipt(){
        System.out.println("receipt printed");
    }
}
