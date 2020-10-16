public class Teacher extends User {
    private int ptoDays = 10;

    public Teacher(String firstName, String lastName, String email, String userName, String password, int absences) {
        super(firstName, lastName, email, userName, password, absences);
    }

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    @Override
    public void absentDays(int days) {
        this.ptoDays = ptoDays - days;
        setAbsences(getAbsences() + days);
        System.out.println("You have  " + ptoDays + " pto days left.");
    }
}
