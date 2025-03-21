import java.util.Arrays;
import java.util.Scanner;



public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wielkość tablicy: ");
        int size = scanner.nextInt();

        System.out.print("Podaj wartość pierwszego elementu: (int)");
        int firstElement = scanner.nextInt();

        int[] array = new int[size];
        array[0] = firstElement;

        for (int i = 1; i < size; i++) {
            array[i] = array[i - 1] + 2;
        }

        System.out.println("Utworzona tablica: " + Arrays.toString(array));

        System.out.println("Min: " + findMin(array));
        System.out.println("Max: " + findMax(array));
        System.out.println("Suma: " + sum(array));
        System.out.println("Średnia: " + average(array));
        System.out.println("Mediana: " + median(array));

        scanner.close();
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    public static double average(int[] array) {
        return sum(array) / (double) array.length;
    }

    public static double median(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            return array[length / 2];
        }
    }
}
