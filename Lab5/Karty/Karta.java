package Karty;

public class Karta {
    private Figura figura;
    private Kolor kolor;

    public Karta(Figura figura, Kolor kolor) {
        this.figura = figura;
        this.kolor = kolor;
    }

    public String toString() {
        return figura.toString() + " " + kolor.toString();
    }
}
