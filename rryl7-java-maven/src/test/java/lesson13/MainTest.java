package lesson13;

import lesson13.Main;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MainTest {
    @Test
    public void testSum0() {
        int result1 = Main.sum(0, 0);
        assertEquals(result1, 0);
    }

    @Test
    public void testSum() {

        int result2 = Main.sum(5, 8);
        assertEquals(result2, 13);
    }

    @Test
    public void testSumMax() {

        int result3 = Main.sum(Integer.MAX_VALUE, 1);
        assertEquals(result3, Integer.MIN_VALUE);
    }
}
