package Jan13;

public class Login {

    String username;
    String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void userLogin(String username, String pass){
        if(username.equals(this.username) && pass.equals(password)){
            System.out.println("you are logged in");
        }else{
            System.out.println("Please try with correct username and password");
        }
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername() {
        return username;
    }




}
