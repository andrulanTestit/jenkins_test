class BinarySearch {
    // Returns index of x if it is present in arr[l.. 
    // r], else return -1 
    int binarySearch(int[] arr, int startIndex, int endIndex, int searchedNumber) {
        // We reach here when element is not present
        // in array
        if (startIndex >= endIndex) {
            throw new IllegalArgumentException("Elemnt is not found in array");
        }

        int mid = startIndex + (endIndex - startIndex) / 2;
        int middleElement = arr[mid];

        // If the element is present at the
        // middle itself
        if (middleElement == searchedNumber)
            return mid;

        // If element is smaller than mid, then
        // it can only be present in left subarray
        if (middleElement > searchedNumber)
            return binarySearch(arr, startIndex, mid - 1, searchedNumber);

        // Else the element can only be present
        // in right subarray
        return binarySearch(arr, mid + 1, endIndex, searchedNumber);
    }

    // Driver method to test above 
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 40};
        int result = ob.binarySearch(arr, 0, arr.length - 1, -10);
        System.out.println("Element found at index " + result);
    }
}