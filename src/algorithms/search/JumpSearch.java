package algorithms.search;

public class JumpSearch {

    public static int search(int[] sortedArray, int searched) {
        int counter = 0;
        int step = (int) Math.floor(Math.sqrt(sortedArray.length));
        int sThreshHold = 0;
        int eThreshHold = 0;

        while (eThreshHold < sortedArray.length && searched > sortedArray[eThreshHold]) {
            counter++;
            sThreshHold = eThreshHold;
            eThreshHold += step;
        }

        for (; sThreshHold <= Math.min(eThreshHold, sortedArray.length - 1); sThreshHold++) {
            if (sortedArray[sThreshHold] == searched) {
                System.out.println(String.format("Searched (%s) is found in %s", searched, counter));
                return sThreshHold;
            }
            counter++;
        }
        System.out.println(String.format("Searched (%s) is NOT found in %s", searched, counter));
        throw new IllegalArgumentException("Not present");
    }
}
