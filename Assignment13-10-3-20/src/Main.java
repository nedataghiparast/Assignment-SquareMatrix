import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User("Ali", "Alizad", 35, 123321);

        VipUser firstVipUser = new VipUser("Hamed", "Afsharian", 70, 98778);

        LowIncomeUser firstLowIncomeUser = new LowIncomeUser("Neda", "Taghi", 100, 998877);
        System.out.println(firstUser.getFirstName());
        System.out.println(firstUser.getAccountBalance());
        System.out.println(firstUser.getAccountId());
        firstUser.latePayment();
        firstVipUser.latePayment();
        firstLowIncomeUser.latePayment();
    }
    
}
