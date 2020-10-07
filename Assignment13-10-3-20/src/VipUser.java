
public class VipUser extends User {

    public VipUser(String firstName, String lastName, int accountBalance, int accountId) {
        super(firstName, lastName, accountBalance, accountId);

    }

    @Override
    public void latePayment() {
        System.out.println("overdue balance that needs to be paid");
    }
}
