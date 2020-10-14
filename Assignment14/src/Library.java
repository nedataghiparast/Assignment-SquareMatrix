import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookObjects;
    private ArrayList<Employee> employeeObject;
    private ArrayList<User> userObjects;

    public Library(ArrayList<Book> bookObjects, ArrayList<Employee> employeeObject, ArrayList<User> userObjects) {
        this.bookObjects = bookObjects;
        this.employeeObject = employeeObject;
        this.userObjects = userObjects;
    }

    public ArrayList<Book> getBookObjects() {
        return bookObjects;
    }

    public void setBookObjects(ArrayList<Book> bookObjects) {
        this.bookObjects = bookObjects;
    }

    public ArrayList<Employee> getEmployeeObject() {
        return employeeObject;
    }

    public void setEmployeeObject(ArrayList<Employee> employeeObject) {
        this.employeeObject = employeeObject;
    }

    public ArrayList<User> getUserObjects() {
        return userObjects;
    }

    public void setUserObjects(ArrayList<User> userObjects) {
        this.userObjects = userObjects;
    }
}
