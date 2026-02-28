package Feb14;

// till java 7
// rule says any variable in interface are default final and static
// interface can have static method
public interface Audit {
    int age = 20;
    String getAuditorName();
    int completeAudit(String message);

    static void log(String message){
        System.out.println(message);
    }

    default void log(){
        System.out.println("Default logger");
    }
}
