/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void restaurantTest() {
        Review review1 = new Review("i love banana" , "banana consumer", 4);
        List<Review> review = new ArrayList<Review>();
        review.add(review1);
        Restaurant restoTest = new Restaurant("killmyself",4,69);
        restoTest.addReview(review);
        assertEquals("killmyself",restoTest.getName());
        assertEquals(4,restoTest.getStars());
        assertEquals(69,restoTest.getPrice());
        assertEquals("i love banana",restoTest.getReview().get(0).getBody());
    }

    @Test void reasonableString() {
        Restaurant test123 = new Restaurant("kikkei",69,69);
        assertEquals(test123.getName() + " " + test123.getStars() + " " + test123.getPrice(),test123.toString());
    }

    @Test void reviewTest() {
        Review revioTest = new Review("kms","banana",420);
        assertEquals("kms",revioTest.getBody());
        assertEquals("banana",revioTest.getAuthor());
        assertEquals(420,revioTest.getStarsNum());
    }

    @Test void reasonableString1() {
        Review test123 = new Review("kikkei","banatato",69);
        assertEquals(test123.getBody() + " " + test123.getAuthor() + " " + test123.getStarsNum(),test123.toString());
    }
}
