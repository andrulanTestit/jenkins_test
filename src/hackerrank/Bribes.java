package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Bribes {


    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        Set<Integer> numbers = new HashSet<>();
        for (Integer n : arr) {
            numbers.add(n);
        }
        return (int) numbers
                .stream()
                .filter(number -> numbers.contains(number - k))
                .count();

//        int pairs = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] - arr[j] == Math.abs(k)) {
//                    pairs++;
//                }
//            }
//        }
//        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);

        System.out.println(result);

        scanner.close();
    }
}

