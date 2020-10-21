public class Main {
    public static void main(String[] args) {

    char s[] = {'f','u','n'};
        System.out.println(convertToString(s));
    }


    public static String convertToString(char[] a) {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < a.length; i++){
            str.append(a[i]);
        }
        return str.toString();
    }


}
