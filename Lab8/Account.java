import java.util.Scanner;

public class Account {
    private double balance; // Stan konta

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    // Metoda do wypłaty środków
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Brak wystarczających środków na koncie.");
        }
        balance -= amount; // Zmniejszenie salda o wypłaconą kwotę
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(1000); // Konto z początkowym saldem 1000
        boolean validInput = false;

        // Zapętlenie tworzenia konta do momentu, kiedy dane są poprawne
        while (true) {
            try {
                System.out.print("Wprowadź kwotę do wypłaty: ");
                double amount = Double.parseDouble(scanner.nextLine()); // Parsowanie kwoty

                // Próba wypłaty
                account.withdraw(amount);
                System.out.println("Wypłacono: " + amount);
                System.out.println("Pozostałe środki na koncie: " + account.getBalance());
                break; // Jeśli wypłata się udała, wychodzimy z pętli

            } catch (NumberFormatException e) {
                // Obsługuje błąd, gdy użytkownik poda coś, co nie jest liczbą
                System.out.println("Błąd! Proszę wprowadzić poprawną liczbę.");
            } catch (InsufficientFundsException e) {
                // Obsługuje przypadek, gdy użytkownik próbuje wypłacić więcej niż dostępne środki
                System.out.println("Błąd! " + e.getMessage());
            }
        }
    }
}
