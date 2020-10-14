import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Character out = new Mage("Ali","abcd");
        Character out1 = new Rogue("jan","efgh");
        Character out2 = new Knight("july","ijkl");
        out.rangedAttack();
        out.closeAttack();
        out.specialAttack();

        out1.rangedAttack();
        out1.closeAttack();
        out1.specialAttack();

        out2.rangedAttack();
        out2.closeAttack();
        out2.specialAttack();


    }
}
