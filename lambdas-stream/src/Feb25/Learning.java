package Feb25;

public interface Learning {
    String learn(String sub, String lev);

}

class Main{
    public static void main(String[] args) {
        Learning learning = (s,l) -> s + " --sub" + l + " --lev";
        System.out.println(learning.learn("bls", "df"));
    }
}
