package hackerrank;

import java.io.*;
import java.util.*;

public class Socks {


    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pairsAmount = 0;
        Set<Integer> colors = new HashSet<>();
        for (int i1 : ar) {
            colors.add(i1);
        }
        for (int color : colors) {
            pairsAmount += copiesAmount(color, ar) / 2;
        }
        return pairsAmount;
    }

    static int copiesAmount(int color, int[] ar) {
        int copiesAmount = 0;
        for (int i = 0; i < ar.length; i++) {
            if (color == ar[i]) copiesAmount++;
        }
        return copiesAmount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

        scanner.close();
    }
}
