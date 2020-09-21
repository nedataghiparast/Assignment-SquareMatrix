public class User {
    public String firstName;
    public String lastName;
    public String userName;
    private String password;

    // constructor
    public User(String firstName,String lastName,String username,String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = username;
        this.password = password;


    }
    // get
    public String getFirstName() {

        return firstName;
    }
    // set
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }
    // get
    public String getLastName() {

        return lastName;
    }
    // set
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
    // get
    public String getUserName() {

        return userName;
    }
    // set
    public void setUserName(String userName) {

        this.userName = userName;
    }
    // get
    public String getPassword() {

        return password;
    }
    // set
    public void setPassword(String password) {
       if(password.length()<10) {
           System.out.println("not enough character. password must be at least ten characters");
       } else {
           System.out.println("password changed");
           this.password = password;
       }
    }
}
