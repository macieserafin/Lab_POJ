package Karty;

public class Karty_Main {
    public static void main(String[] args) {

        for (Kolor kolor : Kolor.values()) {
            for (Figura figura : Figura.values()) {
                Karta karta = new Karta(figura, kolor);
                System.out.println(karta);
            }
        }
    }
}
