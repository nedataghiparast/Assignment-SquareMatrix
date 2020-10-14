import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookObjects = new ArrayList<>();
        ArrayList<Employee> employeeObjects = new ArrayList<>();
        ArrayList<User> userObjects = new ArrayList<>();
        Library redmond = new Library(bookObjects,employeeObjects,userObjects);
        Book cinderella = new Book("cinderella","fisher",200);
        ArrayList<Book> test = new ArrayList<>();
        User neda = new User("neda","taghi","nedataghiparast@gmail.com",987789,test,20);
        Employee Ali = new Employee("ali","alizad","9898ss@gmail",52343,test,25.2, 5, "user", "pass" );
        System.out.println(Ali.toString());
        System.out.println(neda.toString());
        System.out.println(cinderella.toString());
        System.out.println(redmond.toString());
    }


}
