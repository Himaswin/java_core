package Feb14;

public class AuditorMain {
    public static void main(String[] args) {


        Audit audit = new Audit() {
            @Override
            public String getAuditorName() {
                return "echo";
            }

            @Override
            public int completeAudit(String message) {
                return 6;
            }
        };
        System.out.println(audit.getAuditorName() + " " + audit.completeAudit("complete"));
    }
}
