public class Media {
    private String Title;
    private double length;
    private String[] Actors;

    public Media(String Title, double length, String[] Actors ) {
        this.Title = Title;
        this.length = length;
        this.Actors = Actors;
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
