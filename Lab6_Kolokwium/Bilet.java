public class Bilet {

    private Rodzaj rodzaj;
    private Czas czas;

    public enum Rodzaj {
        normalny, ulgowy
    }

    public enum Czas {
        jedorazowy, godzinny, dobowy
    }

    public Bilet(Rodzaj rodzaj, Czas czas) {
        this.rodzaj = rodzaj;
        this.czas = czas;
    }

    public Rodzaj getRodzaj() {
        return rodzaj;
    }

    public Czas getCzas() {
        return czas;
    }
}
