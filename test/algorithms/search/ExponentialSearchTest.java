package algorithms.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
public class ExponentialSearchTest {

    private final ExponentialSearch exponentialSearch = new ExponentialSearch();

    @Test
    public void allCasesRecursion() {
        final int[] testPowerArray = {0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        assertEquals(6, exponentialSearch.search(testPowerArray, 32));

        final int[] testEvenArray = {1, 2, 3, 4};
        assertEquals(0, exponentialSearch.search(testEvenArray, 1));
        assertEquals(1, exponentialSearch.search(testEvenArray, 2));
        assertEquals(2, exponentialSearch.search(testEvenArray, 3));
        assertEquals(3, exponentialSearch.search(testEvenArray, 4));
        assertThrows(IllegalArgumentException.class, () -> exponentialSearch.search(testEvenArray, 5));

        final int[] testOddArray = new int[]{1, 2, 3, 4, 5};
        assertEquals(0, exponentialSearch.search(testOddArray, 1));
        assertEquals(1, exponentialSearch.search(testOddArray, 2));
        assertEquals(2, exponentialSearch.search(testOddArray, 3));
        assertEquals(3, exponentialSearch.search(testOddArray, 4));
        assertEquals(4, exponentialSearch.search(testOddArray, 5));
        assertThrows(IllegalArgumentException.class, () -> exponentialSearch.search(testOddArray, 6));
        assertThrows(IllegalArgumentException.class, () -> exponentialSearch.search(testOddArray, -20));
    }


}