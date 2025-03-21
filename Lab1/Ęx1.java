import java.util.Scanner;

public class Ęx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int num1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int num2 = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int num3 = scanner.nextInt();

        boolean result = (num1 + num2) == num3;

        System.out.println(result);

        scanner.close();
    }
}
