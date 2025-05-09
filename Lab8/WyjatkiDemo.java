public class WyjatkiDemo {


    public static void rzucWyjatek() {
        throw new RuntimeException("Coś poszło nie tak — wyjątek został rzucony!");
    }

    public static void main(String[] args) {

        // a) Wywołanie metody bez try-catch (możesz najpierw to przetestować)
        // rzucWyjatek();  // odkomentuj, by zobaczyć wyjątek w konsoli

        // b) Wywołanie metody z try-catch
        try {
            rzucWyjatek();
        } catch (RuntimeException e) {
            // c) Wypisanie wiadomości z wyjątku
            System.out.println("Złapano wyjątek: " + e.getMessage());
        }

        System.out.println("Program działa dalej.");
    }
}
