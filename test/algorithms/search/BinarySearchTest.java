package algorithms.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
public class BinarySearchTest {

    private final BinarySearchRecursion binarySearchRecursion = new BinarySearchRecursion();
    private final BinarySearchLoop binarySearchLoop = new BinarySearchLoop();


    @Test
    public void allCasesRecursion() {
        final int[] testEvenArray = {1, 2, 3, 4};
        assertEquals(0, binarySearchRecursion.search(testEvenArray, 1, 0, testEvenArray.length - 1, 0));
        assertEquals(1, binarySearchRecursion.search(testEvenArray, 2, 0, testEvenArray.length - 1, 0));
        assertEquals(2, binarySearchRecursion.search(testEvenArray, 3, 0, testEvenArray.length - 1, 0));
        assertEquals(3, binarySearchRecursion.search(testEvenArray, 4, 0, testEvenArray.length - 1, 0));
        assertThrows(IllegalArgumentException.class, () -> binarySearchRecursion.search(testEvenArray, 5, 0, testEvenArray.length - 1, 0));
        final int[] testOddArray = new int[]{1, 2, 3, 4, 5};
        assertEquals(0, binarySearchRecursion.search(testOddArray, 1, 0, testOddArray.length - 1, 0));
        assertEquals(1, binarySearchRecursion.search(testOddArray, 2, 0, testOddArray.length - 1, 0));
        assertEquals(2, binarySearchRecursion.search(testOddArray, 3, 0, testOddArray.length - 1, 0));
        assertEquals(3, binarySearchRecursion.search(testOddArray, 4, 0, testOddArray.length - 1, 0));
        assertEquals(4, binarySearchRecursion.search(testOddArray, 5, 0, testOddArray.length - 1, 0));
        assertThrows(IllegalArgumentException.class, () -> binarySearchRecursion.search(testOddArray, 6, 0, testEvenArray.length - 1, 0));
        assertThrows(IllegalArgumentException.class, () -> binarySearchRecursion.search(testOddArray, -20, 0, testEvenArray.length - 1, 0));
    }

    @Test
    public void allCasesLoop() {
        assertThrows(IllegalArgumentException.class, () -> binarySearchLoop.search(new int[]{}, 5));
        assertEquals(0, binarySearchLoop.search(new int[]{1}, 1));

        final int[] testEvenArray = {1, 2, 3, 4};
        assertEquals(0, binarySearchLoop.search(testEvenArray, 1));
        assertEquals(1, binarySearchLoop.search(testEvenArray, 2));
        assertEquals(2, binarySearchLoop.search(testEvenArray, 3));
        assertEquals(3, binarySearchLoop.search(testEvenArray, 4));
        assertThrows(IllegalArgumentException.class, () -> binarySearchLoop.search(testEvenArray, 5));
        final int[] testOddArray = new int[]{1, 2, 3, 4, 5};
        assertEquals(0, binarySearchLoop.search(testOddArray, 1));
        assertEquals(1, binarySearchLoop.search(testOddArray, 2));
        assertEquals(2, binarySearchLoop.search(testOddArray, 3));
        assertEquals(3, binarySearchLoop.search(testOddArray, 4));
        assertEquals(4, binarySearchLoop.search(testOddArray, 5));
        assertThrows(IllegalArgumentException.class, () -> binarySearchLoop.search(testOddArray, 6));
        assertThrows(IllegalArgumentException.class, () -> binarySearchLoop.search(testOddArray, -20));
    }
}