package inheritance;

import java.util.*;

public class Restaurant extends Review {
    private String name;
    private int stars;
    private int price;

//    List<Review> review;
//
//    public List<Review> getReview() {
//        return review;
//    }
//
//    public void addReview(List<Review> review) {
//        this.review = review;
//        int starsAvg1 = this.getStars();
//        for(int i = 0 ; i<review.size() ; i++){
//            starsAvg1 = starsAvg1 + review.get(i).getStarsNum();
//        }
//        starsAvg1=starsAvg1/(review.size()+1);
//        this.setStars(starsAvg1);
//    }

    public String toString() {
        return ("Restaurant Name : "+this.getName() + "\n" +"Stars : " + this.getStars() + "\n" +"Price : "+this.getPrice())+"\n"+"Reviews : "+getReview();
    }

    public Restaurant(String name, int stars, int price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
