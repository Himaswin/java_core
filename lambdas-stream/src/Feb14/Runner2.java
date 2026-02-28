package Feb14;

// functional programming - OOP(everything rounds with objs)
// functions/methods are the first class citizen-- inshort i can use funtin wherever i want it.
// you have to use interfaces(pure)
// lambdas -- java.util.functions
// only interface with 1 abstract method are allowed
// we can add default

//backward compatibility -- default methods

// (arguments) - {} // body
@FunctionalInterface
interface CustomPublisher{
    void publishName(String name);
    default void publishEmail(String email){
        System.out.println("blklk");
    }
}


interface Game{
    String drawGame(String team1, String team2);
}
public class Runner2 {
    public static void main(String[] args) {


        //anonymous class
        CustomPublisher customPublisher = new CustomPublisher() {
            @Override
            public void publishName(String name) {
                System.out.println("anonymous publisher");
            }
        };

        //lambda
        CustomPublisher customPublisher1 = ( name)->{
            System.out.println("Anonymous " + name);
        };
        customPublisher1.publishName("john");


        Game game = (t1, t2) ->{
            return Math.random()>0.5?t1:t2;
        };
        System.out.println("winner is : " + game.drawGame("jj", "gg"));
    }
}


class StringPublisher implements CustomPublisher{
    @Override
    public void publishName(String name){
        System.out.println("Hello from publisher");
    }
}
