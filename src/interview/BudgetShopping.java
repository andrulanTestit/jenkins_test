package interview;

import java.io.*;
import java.util.*;
import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'budgetShopping' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY bundleQuantities
     *  3. INTEGER_ARRAY bundleCosts
     */


    public static int budgetShopping(int n, List<Integer> bundleQuantities, List<Integer> bundleCosts) {
        return calculateQuantities(n, bundleQuantities, bundleCosts, 0 , 0);
    }

    static int calculateQuantities(int budget, List<Integer> bundleQuantities, List<Integer> bundleCosts, int quantity, int cost) {
        int maxAvailableQuantity = quantity;
        for (int i = 0; i < bundleQuantities.size(); i++) {
            if (cost + bundleCosts.get(i) <= budget) {
                int recQuantity = quantity + bundleQuantities.get(i);
                int recCost = cost + bundleCosts.get(i);
                int quantityAmount = calculateQuantities(budget, bundleQuantities, bundleCosts, recQuantity, recCost);

                if (maxAvailableQuantity < quantityAmount) {
                    maxAvailableQuantity = quantityAmount;
                }
            }
        }
        return maxAvailableQuantity;
    }

}

public class BudgetShopping {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int bundleQuantitiesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> bundleQuantities = IntStream.range(0, bundleQuantitiesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int bundleCostsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> bundleCosts = IntStream.range(0, bundleCostsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.budgetShopping(n, bundleQuantities, bundleCosts);

        System.out.println(result);

        bufferedReader.close();
    }
}
