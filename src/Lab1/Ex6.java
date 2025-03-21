import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta.");
        } else {
            System.out.println("Liczba jest nieparzysta.");
        }

        scanner.close();
    }

}
