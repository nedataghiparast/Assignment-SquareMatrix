public class Table {
    public static void main(String[] args) {
        logsNum();
        logsNum1();
        logsNum2();
    }

    public static void logsNum() {
        for(int i = 1; i<=10; i++) {
            System.out.println(i);
        }


    }

    public static void logsNum1() {
        int i = 1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }


    }

    public static void logsNum2() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i<=10);
        }

    }

