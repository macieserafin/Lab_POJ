public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message); // Przekazanie wiadomości do konstruktora klasy nadrzędnej Exception
    }
}
