package bester;

import java.util.List;

public class BestFinder {
    public Rectangle findBest(Rectangle rectangle) {
        return rectangle;
    }

    public Rectangle findBest(Rectangle rectangle1, Rectangle rectangle2) {
        if(isBetter(rectangle2, rectangle1))
            return rectangle1;
        else return rectangle2;
    }

    public Rectangle findBest(List<Rectangle> rectangles) {
        Rectangle best = rectangles.get(0);
        for (Rectangle rectangle: rectangles)
        {
            if(isBetter(best, rectangle))
                best = rectangle;
        }
        return best;
    }

    private boolean isBetter(Rectangle best, Rectangle rectangle) {
        return rectangle.isBetter(best);
    }

    public Bestable findBestCookie(Bestable cookie) {
        return cookie;
    }

    public Bestable findBestCookie(Cookie ... cookies) {
        Cookie best = cookies[0];
        for(Cookie cookie: cookies){
            if(isBetter(best, cookie)){
                best = cookie;
            }
        }
        return  best;
    }

    private boolean isBetter(Cookie best, Bestable cookie) {
        return cookie.isBetter(best);
    }
}
