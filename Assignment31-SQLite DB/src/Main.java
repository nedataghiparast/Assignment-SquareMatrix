import java.sql.*;
import java.util.concurrent.Callable;

public class Main {
    public static final String DB_NAME = "test.db";
    public static final String DB_PATH = "jdbc:sqlite:/Users/neda/repositories/Assignment31-SQLite DB/" + DB_NAME;
    public static final String TABLE_MOVIES = "Movies";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_YEAR = "year";
    public static final String COLUMN_LENGTH = "length";
    public static final String COLUMN_ACTOR = "actor";

    public static void main(String[] args) {
        try {
            Connection coon = DriverManager.getConnection("jdbc:sqlite:/Users/neda/repositories/Assignment31-SQLite DB/test.db");
            Statement statement = coon.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS Movies (name TEXT, year INTEGER, length INTEGER, actor TEXT)");

            statement.execute("INSERT INTO Movies (name, year, length, actor) VALUES ('MARYAM',1989,8,'JAN')");
            statement.execute("INSERT INTO Movies (name, year, length, actor) VALUES ('MINA',1999,5,'MAHDI')");
            statement.execute("INSERT INTO Movies (name, year, length, actor) VALUES ('BABEL',2006,10,'JALAL')");
            statement.execute("INSERT INTO Movies (name, year, length, actor) VALUES ('ESHGH',2010,10,'KARI')");

            statement.execute("UPDATE Movies SET actor= 'JON' WHERE name='BABEL'");
            statement.execute("UPDATE Movies SET year=2010 WHERE name='MINA'");

            statement.execute("DELETE FROM Movies WHERE name='ESHGH'");
            statement.execute("DELETE FROM Movies WHERE actor='JAN'");

            ResultSet results = statement.executeQuery("SELECT * FROM Movies");
            while (results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getString("year") + " " +
                        results.getString("length") + " " +
                        results.getString("actor"));
            }
            results.close();

            statement.close();
            coon.close();

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());

        }
    }
}
