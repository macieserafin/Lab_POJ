import java.util.Scanner;

public class Lab2_Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Wprowadź " + size + " elementów do tablicy:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Tablica w odwróconej kolejności:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
