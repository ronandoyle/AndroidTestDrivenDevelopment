package nanorstudios.ie.testdrivendevelopment;

/**
 * A counter object.
 */

public class Counter {

    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addCounter() {
        count++;
    }

    public void subtractCounter() {
        count--;
    }
}
