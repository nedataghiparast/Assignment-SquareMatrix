public class Student extends User{
    public Student(String firstName, String lastName, String email, String userName, String password, int absences) {
        super(firstName, lastName, email, userName, password, absences);
    }

    @Override
    public void absentDays(int days) {
        setAbsences(getAbsences() + days);
        System.out.println("You have  " +  this.getAbsences()  + "  so far" );

    }
}
