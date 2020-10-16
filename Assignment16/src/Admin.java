public class Admin extends User {
    private int ptoDays = 20;

    public Admin(String firstName, String lastName, String email, String userName, String password, int absences) {
        super(firstName, lastName, email, userName, password, absences);

    }


    @Override
    public void absentDays(int days) {
        this.ptoDays = ptoDays - days;
        setAbsences(getAbsences() + days);
        System.out.println("You have  " + ptoDays + " pto days left.");


    }
}
