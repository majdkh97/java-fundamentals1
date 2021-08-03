package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Review{
    private String name;
    private List<String> movies;



    List<Review> review = new ArrayList<>();


    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }


    public Theater(String name,List<String> movies){
        this.name=name;
        this.movies=movies;
    }

    public void addMovie(String movie){
        movies.add(movie);
    }

    public void removeMovie(String movie){
        for(int i = 0 ; i<movies.size();i++){
            if(movies.get(i)==movie){
                movies.remove(i);
            }
        }
    }

    public String toString() {
        return ("Theater Name : "+this.getName() + "\n" +"Movies : "+this.getMovies()+"\n"+"Reviews : "+getReview());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }
}
