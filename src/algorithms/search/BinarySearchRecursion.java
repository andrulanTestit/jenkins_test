package algorithms.search;

import java.util.Arrays;

public class BinarySearchRecursion {

    public int search(int[] sortedArray, int searchedNumber, int sIndex, int eIndex, int iteration) {
        if (sIndex > eIndex) {
            System.out.printf("Array: %s, searched: %s, EXCEPTION after iterations amount: %s\n",
                    Arrays.toString(sortedArray), searchedNumber, iteration);
            throw new IllegalArgumentException(String.format("SearchedNumber: %s is not present at array %s",
                    searchedNumber, Arrays.toString(sortedArray)));
        }

        iteration++;
        int mIndex = eIndex - (eIndex - sIndex) / 2;
        int mValue = sortedArray[mIndex];

        if (searchedNumber == mValue) {
            System.out.printf("Array: %s, searched: %s, iterations amount: %s\n",
                    Arrays.toString(sortedArray), searchedNumber, iteration);
            return mIndex;
        }

        if (searchedNumber > mValue) {
            return search(sortedArray, searchedNumber, mIndex + 1, eIndex, iteration);
        }
        return search(sortedArray, searchedNumber, sIndex, mIndex - 1, iteration);

    }
}
