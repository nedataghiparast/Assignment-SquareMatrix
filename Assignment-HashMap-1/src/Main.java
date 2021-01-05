import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        add("nedataghiparast@gmail.com", "Neda", hm);
        add("ansari@gmail.com", "Sara", hm);
        add("moallemf@gmail.com", "Farzane", hm);
        System.out.println(get("nedataghiparast@gmail.com", hm));
        System.out.println(get("ansari@gmail.com", hm));
        System.out.println(get("moallemf@gmail.com", hm));
        remove("nedataghiparast@gmail.com", hm);
        System.out.println(hm);
        remove("ansari@gmail.com", hm);
        System.out.println(hm);
        remove("moallemf@gmail.com", hm);
        System.out.println(hm);
    }
    public void run() {

    }

    public static void add(String email, String name, HashMap hm) {
        hm.put(email, name);
    }
    public static String get(String email, HashMap hm) {
        return (String) hm.get(email);
    }
    public static void remove(String email, HashMap hm) {
        hm.remove(email);
    }
}
