import java.util.Scanner;

public class Lab2_Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj czas w formacie 24-godzinnym (HH:mm): ");
        String time24 = scanner.nextLine();

        if (time24.length() != 5 || time24.charAt(2) != ':') {
            System.out.println("Nieprawidłowy format czasu. Użyj formatu HH:mm.");
            return;
        }

        String hourStr = time24.substring(0, 2);
        String minuteStr = time24.substring(3, 5);

        int hour = Integer.parseInt(hourStr);
        int minute = Integer.parseInt(minuteStr);

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            System.out.println("Nieprawidłowy czas. Godzina musi być w zakresie 00-23, a minuty w zakresie 00-59.");
            return;
        }

        String period = (hour >= 12) ? "PM" : "AM";
        if (hour == 0) {
            hour = 12;
        } else if (hour > 12) {
            hour -= 12;
        }

        System.out.printf("Czas w formacie 12-godzinnym: %02d:%s %s\n", hour, minuteStr, period);

        scanner.close();

    }
}
