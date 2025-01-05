public class user {

    private String username;
    private String pass;
    private boolean valid;

    public user(String name, String pass){
        this.username = name;
        this.pass = pass;
        this.valid = false;
    }

    public void validation(){
        this.valid = true;
    }

    public boolean namevalid(String name){
        return (this.username.equals(name));
    }

    public boolean passvalid(String password){
        return (this.pass.equals(password));
    }

    public boolean isValid(){
        return passvalid(pass) && valid;
    }
}
