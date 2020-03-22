import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Самые частые байты
*/

public class Test {
    private static float extractValidCostValue(BigDecimal decimal) {
        String decimalString = decimal.toString();
        float decimalFloat = decimal.floatValue();
        if (decimalString.charAt(decimalString.length() - 1) == '0') {
            return decimalFloat + 0.01f;
        }
        return decimalFloat;
    }

    public static void main(String[] args) throws IOException {


//        BufferedReader
        int y = 0;
        int k = 4;
        while (k > 2 ){
            k = k - 1;
        }
        System.out.println("y = " + y);
        System.out.println("k = " + k);
        System.out.println("mod = " + k);




        BigDecimal bigDecimal = new BigDecimal("1.31").setScale(2, RoundingMode.UP);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.toString());
        System.out.println(bigDecimal.floatValue());
        System.out.println(extractValidCostValue(bigDecimal));

//        Float.valueOf()
//        BigDecimal bigDecimal1 = bigDecimal.setScale(2, RoundingMode.HALF_UP);
//        System.out.println(bigDecimal1);
//        System.out.println(bigDecimal1.toBigInteger());

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        for (Integer i : list) {
//            System.out.println(i);
//        }
//

//        List<Integer> list = new ArrayList<>(1000);
//        for (int i = 0; i < 1000; i++) {
//            list.add(i);
//        }
//
//        AtomicInteger i = new AtomicInteger();
//        List<Integer> values = Collections.synchronizedList(new ArrayList<>());
//        list.parallelStream().forEach(iii -> {
//            values.add(i.getAndIncrement());
//        });
//
//        values.forEach(System.out::println);


//        TreeSet<Integer> treeSet = Arrays
//                .stream("01|15|59, 1|46|6, 01|17|20".split(","))
//                .map(time -> {
//                    String[] ints = time.trim().split("\\|");
//                    return Integer.valueOf(ints[0]) * 60 * 60 + Integer.valueOf(ints[0]) * 60 + Integer.valueOf(ints[2]);
//                })
////                .collect(Collectors.toCollection(() -> new TreeSet<>(Integer::compareTo)));
//                .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
//
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.last());
//        System.out.println(treeSet.stream().reduce(0, (a, b) -> a + b) / treeSet.size());
    }
}
