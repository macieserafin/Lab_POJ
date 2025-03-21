import java.util.Scanner;

public class Lab2_Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość promienia: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("Pole koła: " + area);
        System.out.println("Obwód koła: " + circumference);

        scanner.close();
    }
}
