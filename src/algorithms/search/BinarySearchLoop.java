package algorithms.search;

import java.util.Arrays;

public class BinarySearchLoop {

    public int search(int[] sortedArray, int searchedNumber) {

        int iteration = 0;
        int sIndex = 0;
        int eIndex = sortedArray.length - 1;

        while (sIndex <= eIndex) {
            iteration++;

            int mIndex = eIndex - (eIndex - sIndex) / 2;
            int mValue = sortedArray[mIndex];

            if (searchedNumber == mValue) {
                System.out.printf("Array: %s, searched: %s, iterations amount: %s\n",
                        Arrays.toString(sortedArray), searchedNumber, iteration);
                return mIndex;
            }

            if (searchedNumber > mValue) {
                sIndex = mIndex + 1;
            } else {
                eIndex = mIndex - 1;
            }
        }

        throw new IllegalArgumentException(String.format("SearchedNumber: %s is not present at array %s",
                searchedNumber, Arrays.toString(sortedArray)));

    }

}
