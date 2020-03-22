package tddlessons;

public class IsbnValidator {

    public static boolean validate(String isbn) {
        if (isbn.length() != 10 && isbn.length() != 13) {
            return false;
        }
        int sum = 0;

        if (isbn.length() == 13) {
            for (int i = 1; i < 13; i++) {
                if (!Character.isDigit(isbn.charAt(i - 1))) {
                    throw new NumberFormatException(isbn.charAt(i - 1) + " is not a digit!");
                }
                int digit = Character.getNumericValue(isbn.charAt(i - 1));
                sum += i % 2 == 1 ? digit : digit * 3;
            }
            int checkDigit = sum % 10;
            if (checkDigit != 0) {
                checkDigit = 10 - checkDigit;
            }
            return checkDigit == Character.getNumericValue(isbn.charAt(12));
        } else {
            for (int i = 0; i < 10; i++) {
                if (!Character.isDigit(isbn.charAt(i))) {
                    if (i == 9 && isbn.charAt(i) == 'X') {
                        sum += 10;
                    } else {
                        throw new NumberFormatException(isbn.charAt(i) + " is not a digit!");
                    }
                } else {
                    sum += Character.getNumericValue(isbn.charAt(i)) * (10 - i);
                }
            }
            return sum % 11 == 0;
        }
    }
}
