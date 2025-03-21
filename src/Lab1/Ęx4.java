import java.util.Scanner;

public class Ęx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszy string: ");
        String str1 = scanner.nextLine();

        System.out.print("Podaj drugi string: ");
        String str2 = scanner.nextLine();

        String result = str1 + str2;

        System.out.println("Połączony string: " + result);

        scanner.close();

    }
}
