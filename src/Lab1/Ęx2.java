import java.util.Scanner;

public class Ęx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        totalSeconds %= 3600;

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
        //System.out.print(hours + ":" + minutes + ":" + seconds);

        scanner.close();

    }
}
