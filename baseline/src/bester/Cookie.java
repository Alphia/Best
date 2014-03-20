package bester;

public class Cookie implements Bestable<Cookie> {

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    public int getNumberOfChocolateChips() {
        return numberOfChocolateChips;
    }

    @Override
    public boolean isBetter(Cookie cookie) {
        return this.numberOfChocolateChips > cookie.getNumberOfChocolateChips();
    }
}
