public class LowIncomeUser extends User {
    private int latePayment;

    public LowIncomeUser(String firstName, String lastName, int accountBalance, int accountId) {
        super(firstName, lastName, accountBalance, accountId);
        this.latePayment = latePayment;

    }


    public void latePayment(int lateFee) {
        this.latePayment -= 40;
        System.out.println("you have been charged 40. your new balance is " + getAccountBalance());

    }
}
