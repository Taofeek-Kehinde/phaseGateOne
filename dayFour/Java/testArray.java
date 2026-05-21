import org.junit.*;
import static org.junit.Assert.*;
import Array.*; 

public class TestListNumber {

    @Test
    public void testThatTheFirstResultIsTrue() {
        int[] result = Array.listNumber(new int[]{8, 6, 12, 4, -2}, 6);
        assertArrayEquals(new int[]{8, -2}, result);
    }

    @Test
    public void testThatTheSecondResultIsTrue() {
        int[] result = Array.listNumber(new int[]{1, 2, 5, 7, 6, 8, 9}, 12);
        assertArrayEquals(new int[]{5, 7}, result);
    }
}
