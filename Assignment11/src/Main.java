import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int Numbers = 8;
         String[] netflixMoviesActors = {"janatan","july"};
        String[] netflixMusicActors = {"janDavid","JudyAbut"};

        Media netflixKidsMovies = new Media("kidsMovies");
        Media netflixKidsMusics = new Media("kidsMusics",8,netflixMusicActors);

        Users Jakei = new Users("Jakei","Wilson","JakW","N22u9989");
        System.out.println(netflixKidsMovies.getTitle());
        System.out.println(netflixKidsMovies.getLength());
        System.out.println(Arrays.toString(netflixKidsMovies.getActors()));
        System.out.println(netflixKidsMusics.getTitle());
        System.out.println(netflixKidsMusics.getLength());
        System.out.println(Arrays.toString(netflixKidsMusics.getActors()));



        System.out.println(Jakei.firstName);
        System.out.println(Jakei.userName);
        System.out.println(Jakei.getPassword());
        Jakei.setPassword("Jakei98765");
        System.out.println(Jakei.getPassword());

    }
}
