package Wyscig;

import java.util.Random;

class Zawodnik {
    String imie;
    int predkoscMin;
    int predkoscMax;
    double pokonanaOdleglosc;

    public Zawodnik(String imie, int predkoscMin, int predkoscMax) {
        this.imie = imie;
        this.predkoscMin = predkoscMin;
        this.predkoscMax = predkoscMax;
        this.pokonanaOdleglosc = 0.0;
    }

    public void przedstawSie() {
        System.out.println("Jestem " + imie + " biegam z prędkością " + predkoscMin + "-" + predkoscMax + " km/h");
    }

    public void biegnij() {
        Random rand = new Random();
        int krok = rand.nextInt(predkoscMax - predkoscMin + 1) + predkoscMin;
        pokonanaOdleglosc += krok;
    }
}
