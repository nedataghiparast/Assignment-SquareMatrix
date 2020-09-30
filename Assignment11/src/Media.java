import java.sql.SQLOutput;

public class Media extends Users {
    private String Title = "Bruce Lee";
    private double length = 123;
    private String[] Actors = {"Bruce Lee", "John Doe"};

    public Media(String Title, double length, String[] Actors) {
        this.Title = Title;
        this.length = length;
        this.Actors = Actors;

    }
    public Media(String Title) {
        this.Title = Title;

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {

        Title = title;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String[] getActors() {
        return Actors;
    }

    public void setActors(String[] actors) {
        Actors = actors;
    }
}
