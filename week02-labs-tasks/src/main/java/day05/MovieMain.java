package day05;

public class MovieMain {

    public static void main(String[] args) {

        Viewer viewer = new Viewer();

        Movie movie = new Movie("The Thing", 1982);
        System.out.println(movie.getInfo());

        System.out.println(viewer.watchMovie(movie, 5));
        System.out.println(viewer.watchMovie(movie, 2));
        System.out.println(viewer.watchMovie(movie, 4));
        System.out.println(viewer.watchMovie(movie, 5));
        System.out.println(viewer.watchMovie(movie, 5));

        System.out.println(movie.getInfo());
    }
}
