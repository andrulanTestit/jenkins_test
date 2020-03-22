package algorithms.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
public class InterpolationSearchTest {

    private final InterpolationSearch interpolationSearch = new InterpolationSearch();

    @Test
    public void allCasesRecursion() {

        // The longest search case, because difference between values is very big and element is in the middle,
        // so it should start from the very beginning
        final int[] testPowerArray = {0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        assertEquals(6, interpolationSearch.search(testPowerArray, 32));

        final int[] testEvenArray = {1, 2, 3, 4};
        assertEquals(0, interpolationSearch.search(testEvenArray, 1));
        assertEquals(1, interpolationSearch.search(testEvenArray, 2));
        assertEquals(2, interpolationSearch.search(testEvenArray, 3));
        assertEquals(3, interpolationSearch.search(testEvenArray, 4));
        assertThrows(IllegalArgumentException.class, () -> interpolationSearch.search(testEvenArray, 5));

        final int[] testOddArray = new int[]{1, 2, 3, 4, 5};
        assertEquals(0, interpolationSearch.search(testOddArray, 1));
        assertEquals(1, interpolationSearch.search(testOddArray, 2));
        assertEquals(2, interpolationSearch.search(testOddArray, 3));
        assertEquals(3, interpolationSearch.search(testOddArray, 4));
        assertEquals(4, interpolationSearch.search(testOddArray, 5));
        assertThrows(IllegalArgumentException.class, () -> interpolationSearch.search(testOddArray, 6));
        assertThrows(IllegalArgumentException.class, () -> interpolationSearch.search(testOddArray, -20));
    }

}