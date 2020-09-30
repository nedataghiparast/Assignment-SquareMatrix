public class Users {
    public String firstName = "John";
    public String lastName = "Doe";
    public String userName = "user";
    private String password = "pass";

    public Users() {

    }
    public Users(String firstName,String lastName,String userName,String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()<9) {
            System.out.println("password must be less than 9 characters");
        }
        else {
            System.out.println("password changed");
        }
        this.password = password;
    }
}
