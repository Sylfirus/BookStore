package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */

public class BookShopTest {

    @Test
    public void nullTest(){
        BookShop a = new BookShop("Test");
        int [] b = null;

        assertEquals(0,a.cost(b));
    }

    @Test
    public void underTest(){
        BookShop a = new BookShop("Test");
        int [] b = {-1,-5,-456};
        assertEquals(0,a.cost(b));
    }

    @Test
    public void overTest(){
        BookShop a = new BookShop("Test");
        int [] b = {1,5,456};
        assertEquals(8,a.cost(b));
    }

    @Test
    public void fulldoublonsTest(){
        BookShop a = new BookShop("Test");
        int [] b = {1,1,1,1,1};
        assertEquals(40,a.cost(b));
    }

    @Test
    public void suiteparfaiteTest(){
        BookShop a = new BookShop("Test");
        int [] b = {0,1,2,3,4};
        assertEquals(26,a.cost(b));
    }
    @Test
    public void melangeTest(){
        BookShop a = new BookShop("Test");
        int [] b = {1,2,3,3,3};
        assertEquals(36.64,a.cost(b));
    }
}
