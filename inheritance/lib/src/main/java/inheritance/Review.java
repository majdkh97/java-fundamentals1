package inheritance;

public class Review {
    private String body;
    private String author;
    private int starsNum;

    public String toString(){
        return (this.getBody() + " " + this.getAuthor() + " " + this.starsNum);
    }

    public Review(String body, String author, int starsNum){
        this.body=body;
        this.author=author;
        this.starsNum=starsNum;
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
}
