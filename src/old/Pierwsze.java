package old;

public class Pierwsze {

    public static int[] pierwsze(int liczba) {
        int i, j, wielkosc;
        int tab[] = new int[liczba + 1];
        wielkosc = (int) Math.floor(Math.sqrt(liczba));
        int length = 0;
        int index = 0;

        for (i = 1; i <= liczba; i++) {
            tab[i] = i;
        }

        for (i = 2; i <= wielkosc; i++) {
            if (tab[i] != 0) {
                j = i + i;
                while (j <= liczba) {
                    tab[j] = 0;
                    j += i;
                }
            }
        }

        for (i = 2; i <= liczba; i++) {
            if (tab[i] != 0) {
                length++;
                System.out.print(i + ", ");
            }
        }

        int[] result = new int[length];
        for (i = 2; i <= liczba; i++) {
            if (tab[i] != 0) {
                result[index++] = i;
            }
        }
        return result;
    }
}
