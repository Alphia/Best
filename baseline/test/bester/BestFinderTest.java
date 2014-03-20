package bester;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BestFinderTest {
    @Test
    public void shouldGetBestFrom1Rectangle(){
        Rectangle rectangle = new Rectangle(2, 3);
        BestFinder finder = new BestFinder();

        Rectangle best = finder.findBest(rectangle);
        assertSame(best, rectangle);
    }

    @Test
    public void shouldGetBestFrom2Rectangles() {
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(3, 3);
        BestFinder finder = new BestFinder();

        Rectangle best = finder.findBest(rectangle1,rectangle2);
        assertThat(rectangle2, is(best));
    }

    @Test
    public void shouldGetBestFrom3Rectangles()  {
        Rectangle bigest = new Rectangle(3, 4);
        List<Rectangle> rectangles = Arrays.asList(new Rectangle(2,3),bigest, new Rectangle(3,3));

        BestFinder finder = new BestFinder();
        Rectangle best = finder.findBest(rectangles);

        assertEquals(best, bigest);
    }

    @Test
    public void shoudlFindBestCookieFrom1Cookie(){
        Bestable cookie = new Cookie(3);
        BestFinder finder = new BestFinder();
        Bestable bestCookie = finder.findBestCookie(cookie);

        assertEquals(bestCookie, cookie);
    }

    @Test
    public void shouldFindBestCookieOutOf3Cookies() {
        BestFinder finder = new BestFinder();
        Bestable bestCookie = new Cookie(8);
        Bestable best = finder.findBestCookie(new Cookie(3), bestCookie, new Cookie(1));

        assertEquals(best, bestCookie);


    }
}
