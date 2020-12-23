import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> containing = new HashMap<String, String>();
        containing.put("nedataghiparast@gmail.com", "Neda");
        containing.put("ansari@gmail.com", "Sara");
        containing.put("moallemf@gmail.com", "Farzane");
        System.out.println(containing.get("nedataghiparast@gmail.com"));
        System.out.println(containing.get("ansari@gmail.com"));
        System.out.println(containing.get("moallemf@gmail.com"));
        containing.remove("nedataghiparast@gmail.com");
        System.out.println(containing);
        containing.remove("ansari@gmail.com");
        System.out.println(containing);
    }

}
