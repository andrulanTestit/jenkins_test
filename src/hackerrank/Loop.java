package hackerrank;

import java.util.*;
import java.io.*;

public class Loop {
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        flag = B > 0 && H > 0;
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive\n");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main



//    private static int pow(int a, int b) {
//        int result = a;
//        if (b == 0) {
//            return 1;
//        }
//        if (b == 1) {
//            return a;
//        }
//        for (int i = 1; i < b; i++) {
//            result = result * a;
//        }
//        return result;
//    }
//
//    public static void main(String[] argh) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        String[] sumArray = new String[t];
//        for (int i = 0; i < t; i++) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            StringBuilder sb = new StringBuilder();
//            for (int j = 0; j < n; j++) {
//                a += pow(2, j) * b;
//                sb.append(a).append(" ");
//            }
//            sumArray[i] = sb.toString();
//        }
//        for (int i = 0; i < sumArray.length; i++) {
//            System.out.println(sumArray[i]);
//        }
//        in.close();
//    }
}


