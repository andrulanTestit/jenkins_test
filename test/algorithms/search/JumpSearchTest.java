package algorithms.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(JUnit4.class)
public class JumpSearchTest {

    private final JumpSearch binarySearchRecursion = new JumpSearch();


    @Test
    public void allCasesRecursion() {
        final int[] testEvenArray = {1, 2, 3, 4};
        final int[] testOddArray = new int[]{1, 2, 3, 4, 5, 6, 7};

        assertEquals(0, binarySearchRecursion.search(testEvenArray, 1));
        assertEquals(1, binarySearchRecursion.search(testEvenArray, 2));
        assertEquals(2, binarySearchRecursion.search(testEvenArray, 3));
        assertEquals(3, binarySearchRecursion.search(testEvenArray, 4));
        assertThrows(IllegalArgumentException.class, () -> binarySearchRecursion.search(testEvenArray, 5));

        assertEquals(0, binarySearchRecursion.search(testOddArray, 1));
        assertEquals(1, binarySearchRecursion.search(testOddArray, 2));
        assertEquals(2, binarySearchRecursion.search(testOddArray, 3));
        assertEquals(3, binarySearchRecursion.search(testOddArray, 4));
        assertEquals(4, binarySearchRecursion.search(testOddArray, 5));
        assertEquals(5, binarySearchRecursion.search(testOddArray, 6));
        assertEquals(6, binarySearchRecursion.search(testOddArray, 7));
        assertThrows(IllegalArgumentException.class, () -> binarySearchRecursion.search(testOddArray, -20));
    }
}