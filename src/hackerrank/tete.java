//package hackerrank;
//
//import java.io.*;
//        import java.math.*;
//        import java.security.*;
//        import java.text.*;
//        import java.util.*;
//        import java.util.concurrent.*;
//        import java.util.function.*;
//        import java.util.regex.*;
//        import java.util.stream.*;
//        import static java.util.stream.Collectors.joining;
//        import static java.util.stream.Collectors.toList;
//
//public class Solution {
//
//
//
//    // Complete the oddNumbers function below.
//    static List<Integer> oddNumbers(int l, int r) {
//        List<Integer> oddNumbers = new ArrayList<>();
//        for (int i = l; i <= r; i++) {
//            if ((i & 1) == 0) {
//                oddNumbers.add(i);
//            }
//        }
//        return oddNumbers;
//    }
//
//    public static void main(String[] args) throws IOException {