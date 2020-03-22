package old;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws ParseException {

        Date d = new Date(System.currentTimeMillis());
        Date d1 = new Date(1550155763*1000);
        System.out.println();
    }

//    public static int gcd(int num1, int num2) {
//        while (num1 != 0 && num2 != 0) {
//            if (num1 > num2) {
//                num1 = num1 % num2;
//            }
//            else {
//                num2 = num2 % num1;
//            }
//        }
//        return num1 + num2;
//    }
}
