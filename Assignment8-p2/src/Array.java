public class Array {
    public static void main(String[] args) {
        String[] SomeUsers = {"Neda","Hossein","Ali","Ahmad"};
        printForEachUser(SomeUsers);
    }

    public static void printForEachUser(String[] users) {
        for (int i = 0; i< users.length; i++) {
            System.out.println("welcome, " +  users[i]);

        }

    }
}
