public class Main {

    public static void main(String[] args) {
        User hd = new User("neda","TaghiParast","NedaT","test");

        System.out.println(hd.firstName);
        System.out.println(hd.userName);
        System.out.println(hd.getPassword());
        hd.setPassword("testin123123");
        System.out.println(hd.getPassword());


        }
    }

