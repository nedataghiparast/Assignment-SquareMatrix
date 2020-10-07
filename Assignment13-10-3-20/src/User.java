public class User {

    private String firstName;
    private String lastName;
    private int accountBalance;
    private int accountId;

    public User(String firstName, String lastName, int accountBalance, int accountId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = accountBalance;
        this.accountId = accountId;
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

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void latePayment() {
        this.accountBalance -= 20;
        System.out.println("you have been charged late payment fee of 20$ your new balance is " + getAccountBalance());

    }
}

