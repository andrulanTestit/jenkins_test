package algorithms.search;

public class InterpolationSearch {

    public int search(int[] sortedArray, int toFind) {
        int mIndex;
        int lIndex = 0;
        int hIndex = sortedArray.length - 1;

        while (sortedArray[lIndex] <= toFind && sortedArray[hIndex] >= toFind) {
            // Value of toFind number
            int difFindAndLow = toFind - sortedArray[lIndex];
            // Searched array length
            int searchedArrayLength = hIndex - lIndex;
            // Value of searched array - difference between highest and lowest elements in searched array
            int difHighAndLow = sortedArray[hIndex] - sortedArray[lIndex];
            // mIndex = lIndex + ((toFind - sortedArray[lIndex]) * (hIndex - lIndex)) / (sortedArray[hIndex] - sortedArray[lIndex]);
            mIndex = lIndex + ((difFindAndLow) * (searchedArrayLength)) / (difHighAndLow);

            if (sortedArray[mIndex] < toFind)
                lIndex = mIndex + 1;
            else if (sortedArray[mIndex] > toFind)
                hIndex = mIndex - 1;
            else
                return mIndex;
        }

        throw new IllegalArgumentException();
    }
}
