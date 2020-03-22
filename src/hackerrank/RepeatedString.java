package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int repeatedChar = countCharAtString(s, s.length());
        if (n % s.length() == 0) {
            return repeatedChar * (n / s.length());
        } else {
            int notUsedSymbols = (int) n % s.length();
            return repeatedChar * (((n - notUsedSymbols) / s.length())) + (countCharAtString(s, notUsedSymbols));
        }
        
    }

    static int countCharAtString(String s, int to) {
        int repeatedChar = 0;
        for (int i = 0; i < to; i++) {
            if ('a' == s.charAt(i)) {
                repeatedChar++;
            }
        }
        return repeatedChar;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);

        scanner.close();
    }
}

