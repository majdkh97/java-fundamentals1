package inheritance;

import java.util.List;

public class Shop extends Review {
    private String name;
    private String description;
    private int num$;

//    List<Review> review;
//
//    public List<Review> getReview() {
//        return review;
//    }
//
//    public void addReview(List<Review> review) {
//        this.review = review;
//    }



    public Shop(String name, String description, int num$) {
        super();
        this.name = name;
        this.description = description;
        this.num$ = num$;
    }


    public String toString() {
        return ("Name : "+this.getName() + "\n" +"Description : " + this.getDescription() + "\n" +"num$ : "+this.getNum$())+"\n"+"Reviews : "+getReview();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNum$() {
        return num$;
    }

    public void setNum$(int num$) {
        this.num$ = num$;
    }
}
