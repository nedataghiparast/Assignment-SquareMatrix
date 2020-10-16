public class Main {
    public static void main(String[] args) {
        Teacher roza = new Teacher("roza", "alizad", "roza00@roza.com", "roz", "roz11", 4);
        Admin usa = new Admin("admin", "adm", "admin@admin.com", "admin", "adm11", 5);
        Student Ali = new Student("ali","alizad","Ali@Ali.com","ali2","1234",6);
        roza.absentDays(3);
        usa.absentDays(2);
        Ali.absentDays(1);

    }
}
