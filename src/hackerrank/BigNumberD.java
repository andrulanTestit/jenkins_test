package hackerrank;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class BigNumberD {

    public static <T> void printArray(T[] printArray) {
        for (int i = 0; i < printArray.length ; i++) {
            System.out.println(printArray[i]);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scan = new Scanner(System.in);
//        scan.nextInt();
//        for (int i = 0; i < 3 ; i++) {
//            String[] val = scan.nextLine().split(" ");
//            for (int j = 0; j < val.length ; j++) {
//                System.out.println(val[j]);
//            }
//        }
//        scan.close();


        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + "," + pair_right[i]);
            System.out.println(set.size());
        }





//        Scanner scan = new Scanner(System.in);
//
//        int listLength = scan.nextInt();
//        scan.nextLine();
//        List<Integer> list = new ArrayList<>();
//        String[] vals = scan.nextLine().split(" ");
//        for (int i = 0; i < vals.length; i++) {
//            list.add(Integer.parseInt(vals[i]));
//        }
//
//        int qAmount = scan.nextInt();
//        scan.nextLine();
//        for (int i = 0; i < qAmount; i++) {
//            String type = scan.nextLine();
//            if (type.equalsIgnoreCase("insert")) {
//                int index = scan.nextInt();
//                int value = scan.nextInt();
//                list.add(index, value);
//            } else {
//                int index = scan.nextInt();
//                list.remove(index);
//            }
//            scan.nextLine();
//        }
//        StringBuilder sb = new StringBuilder();
//        list.forEach(sv -> sb.append(sv).append(" "));
//        System.out.println(sb.toString());
//        scan.close();


//        Scanner scan = new Scanner(System.in);
//        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        List<List<Integer>> listOfLists = new ArrayList<>();
//        int listAmount = scan.nextInt();
//
//
//        for (int i = 0; i < listAmount; i++) {
//            listOfLists.add(new ArrayList<>());
//            String[] items = scan.nextLine().split(" ");
//            for (int j = 0; j < items.length; j++) {
//                listOfLists.get(i).add(Integer.parseInt(items[j]));
//            }
//        }
//
//        List<Integer> answers = new ArrayList<>();
//        int qAmount = scan.nextInt();
//        for (int i = 0; i < qAmount; i++) {
//            String[] items = scan.nextLine().split(" ");
//            int arrNumber = Integer.parseInt(items[0]);
//            int elementNumber = Integer.parseInt(items[1]);
//            answers.add(listOfLists.get(arrNumber).get(elementNumber));
//        }
//
//        answers.forEach(System.out::println);

//        Scanner sc = new Scanner(System.in);
//        int arrLength = sc.nextInt();
//
//        int[] arrrr = new int[arrLength];
//        for (int i = 0; i < arrLength; i++) {
//            arrrr[i] = sc.nextInt();
//        }
//
//        int negativeCount = 0;
//        for (int i = 0; i < arrrr.length; i++) {
//            int sum = arrrr[i];
//            if (sum < 0) {
//                negativeCount++;
//            }
//            for (int j = i + 1; j < arrrr.length; j++) {
//                sum += arrrr[j];
//                if (sum < 0) {
//                    negativeCount++;
//                }
//            }
//        }
//        System.out.println(negativeCount);
//
//        sc.close();

    }


//    public static void main(String[] args) {
//        //Input
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] s = new String[n + 2];
//        for (int i = 0; i < n; i++) {
//            s[i] = sc.next();
//        }
//        sc.close();
//
////        String[] s = new String[n + 2];
////        for (int i = 0; i < n; i++) {
////
////        }
//
//        //Write your code here
//        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
//            @Override
//            public int compare(String a1, String a2) {
//                BigDecimal a = new BigDecimal(a1);
//                BigDecimal b = new BigDecimal(a2);
//                return a.compareTo(b);
//            }
//        }));
//
//        //Output
////        for (int i = 0; i < n; i++) {
////            System.out.println(s[i]);
////        }
//    }

}