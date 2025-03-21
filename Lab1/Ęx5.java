import java.util.Scanner;

public class Ęx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();

        System.out.println("Tabliczka mnożenia dla liczby " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();

    }
}
