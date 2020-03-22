import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        int[] countArr = new int[]{0,0,1,2,3};
        System.out.println(count(countArr, 2));


//        int i = 0, max = 0, len = 3;
//        System.out.println(i);
//        System.out.println(max);
//        System.out.println(len);
//
//        int[] arr = new int[]{20, 30, 10, 40, 50};
//        arr = reverse(arr);
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
    }

    public static int count(int arr[], int val) {
        int i = 0, count = 0, len = arr.length;
        while (i < len) {
            if (arr[i] == val) {
                count += 1;
            }
            i++;
        }
        return count;
    }

        public static int[] reverse(int arr[]) {
        int i, max, location, j, temp, len  = arr.length;

        for (i = 0; i < len ; i++) {
            max = arr[i];
            location = i;
            for ( j = i; j < len; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    location = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[location];
            arr[location] = temp;
        }
        return arr;
    }
}
