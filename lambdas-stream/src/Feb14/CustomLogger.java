package Feb14;

public class CustomLogger implements Logger {


    @Override
    public void log(String message) {
        System.out.println("custom logger");
    }
}
