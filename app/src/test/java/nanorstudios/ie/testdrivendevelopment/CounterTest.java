package nanorstudios.ie.testdrivendevelopment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CounterTest {

    private Counter counter;


    @Before
    public void setUp() {
        counter = new Counter(0);
    }

    @Test
    public void addCounter() {
        counter.addCounter();
        assertEquals(1, counter.getCount());
    }

    @Test
    public void subtractCounter() {
        counter.subtractCounter();
        assertEquals(-1, counter.getCount());
    }
}