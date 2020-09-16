public class Objects {


    public static void main(String[] args) {
        int someNumber = 5;

        String[] netflixMoviesActors = {"jan","julia"};
        String[]  netflixMusicsActors= {"steph","jacob"};


        Media netflixKidsMovies = new Media("kidsMovies",12.5,netflixMoviesActors);
        Media netflixKidsMusics = new Media("kidsMusics",20,netflixMusicsActors);

        System.out.println(netflixKidsMovies.getActors());
        System.out.println(netflixKidsMovies.getLength());
        System.out.println(netflixKidsMovies.getTitle());
        System.out.println(netflixKidsMusics.getActors());
        System.out.println(netflixKidsMusics.getLength());
        System.out.println(netflixKidsMusics.getTitle());



    }
}
