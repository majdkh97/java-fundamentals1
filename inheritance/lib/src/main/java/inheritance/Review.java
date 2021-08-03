package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Review {
    private String body;
    private String author;
    private int starsNum;
    private String movie;


    public Review() {

    }

    public Review(String body, String author, int starsNum) {
        this.body = body;
        this.author = author;
        this.starsNum = starsNum;
    }

    public Review(String body, String author, int starsNum, String movie) {
        this.body = body;
        this.author = author;
        this.starsNum = starsNum;
        this.movie = movie;
    }


    List<Review> review = new ArrayList<>();


    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

    public String toString() {
        return (this.getBody() + " " + this.getAuthor() + " " + this.starsNum + " " + this.getMovie());
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStarsNum() {
        return starsNum;
    }

    public void setStarsNum(int starsNum) {
        this.starsNum = starsNum;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}
