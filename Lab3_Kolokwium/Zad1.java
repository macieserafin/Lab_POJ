import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (b == 0)
        {
            System.out.println("Nie dzielimy przez 0");
        }
        System.out.println(a/b);
    }
}
