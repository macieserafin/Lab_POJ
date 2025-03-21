import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wielkość tablicy: ");
        int size = scanner.nextInt();

        char[] array = new char[size];

        System.out.println("Wpisz " + size + " znaków:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.next().charAt(0);
        }

        System.out.println("Utworzona tablica:");
        for (char c : array) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}
