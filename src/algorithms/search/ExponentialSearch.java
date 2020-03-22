package algorithms.search;

public class ExponentialSearch {

    public int search(int[] sortedArray, int toFind) {
        int oCount = 0;
        int previousIndex = 0;
        int currentIndex = 1;

        //TODO: if not present at array it should not invoke next loop
        while (currentIndex < sortedArray.length && toFind > sortedArray[currentIndex]) {
            oCount++;
            previousIndex = currentIndex;
            currentIndex *= 2;
        }
        return new BinarySearchRecursion().search(sortedArray, toFind,
                previousIndex, Math.min(currentIndex, sortedArray.length - 1), oCount);
    }
}
