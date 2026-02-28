package Feb25;

@FunctionalInterface
interface Printer{
    void print(String team);
}
public class MethodReferancePractice {
    public static void main(String[] args) {

        Printer printer = (t) -> System.out.println("t" + t);
        printer.print("team1");
        printer.print("team2");
        Printer printer1 = MethodReferancePractice::doSomething;
        Printer printer2 = System.out::println;

    }
    public static void doSomething(String task){
        System.out.println("task = " + task );
    }
}
