package Feb14;

public class Runner {
    public static void main(String[] args) {
        CustomLogger logger = new CustomLogger(); //via class
        Logger logger1 = new CustomLogger(); // via interface
        logger.log("everything is fine");

        Logger logger2 = new Logger(){
            @Override
            public void log(String message) {
                System.out.println(message);
            }
        };

        Play play = new Play(){
            @Override
            public void play(){
                System.out.println("hello");
            }
        };

        Audit audit = new Audit() {
            @Override
            public String getAuditorName() {
                return "";
            }

            @Override
            public int completeAudit(String message) {
                return 0;
            }

            @Override
            public void log() {
                Audit.super.log();
            }
        };
        play.play();
        System.out.println(Audit.age);
        Audit.log("hello");

    }
}

abstract class Play{
    public abstract void play();
}

//inheritance
//we can always assign a reference of parent to child class object

//code bloating -- swelling up code redundant code

// we should use anonymous classes

