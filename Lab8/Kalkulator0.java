import java.util.Scanner;

public class Kalkulator0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = getValidInteger(scanner, "Podaj pierwszą liczbę: ");
        int number2 = getValidInteger(scanner, "Podaj drugą liczbę: ");
        char operation = getValidOperation(scanner);

        int result = 0;
        boolean valid = true;

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Nie można dzielić przez zero.");
                    valid = false;
                } else {
                    result = number1 / number2;
                }
                break;
            default:
                valid = false;
                break;
        }

        if (valid) {
            System.out.println("Wynik: " + result);
        }
    }

    public static int getValidInteger(Scanner scanner, String prompt) {
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("To nie jest poprawna liczba. Spróbuj ponownie.");
            }
        }

        return number;
    }

    public static char getValidOperation(Scanner scanner) {
        char operation = ' ';
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Wybierz działanie (+, -, *, /): ");
            String input = scanner.nextLine();
            if (input.length() == 1) {
                char ch = input.charAt(0);
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    operation = ch;
                    isValid = true;
                } else {
                    System.out.println("Niepoprawny znak działania. Spróbuj jeszcze raz.");
                }
            } else {
                System.out.println("Podaj dokładnie jeden znak.");
            }
        }

        return operation;
    }
}
