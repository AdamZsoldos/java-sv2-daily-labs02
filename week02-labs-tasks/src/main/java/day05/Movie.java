package day05;

public class Movie {

    private final String title;
    private final int releaseYear;
    private double userRating;
    private int totalUserRatings;
    private int totalUserRatingScore;

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() { return title; }

    public int getReleaseYear() { return releaseYear; }

    public double getUserRating() { return userRating; }

    public String getInfo() {
        return title + " (" + releaseYear + ") User rating: " + userRating;
    }

    public double rate(int rating) {
        totalUserRatings++;
        totalUserRatingScore += rating;
        userRating = (double) totalUserRatingScore / totalUserRatings;
        return userRating;
    }
}
