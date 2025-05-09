import java.io.IOException;

public class WyjatkiChecked {

    // a) Metoda rzucająca wyjątkiem typu checked (IOException)
    public static void rzucIOException() throws IOException {
        throw new IOException("Ups! Wystąpił błąd wejścia/wyjścia.");
    }

    public static void main(String[] args) {

        // b) Obsługa checked exception za pomocą try-catch
        try {
            rzucIOException();
        } catch (IOException e) {
            // c) Zalogowanie wiadomości z wyjątku
            System.out.println("Złapano wyjątek: " + e.getMessage());
        }

        System.out.println("Program kontynuuje działanie.");
    }
}
