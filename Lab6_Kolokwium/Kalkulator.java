
public class Kalkulator {
    private static final double CENA_BAZOWA = 4.80;

    public void obliczCene(Bilet bilet) {
        double cena = CENA_BAZOWA;

        if (bilet.getRodzaj() == Bilet.Rodzaj.ulgowy) {
            cena *= 0.5;
        }

        switch (bilet.getCzas()) {
            case jedorazowy:
                cena *= 1.0;
                break;
            case godzinny:
                cena *= 1.5;
                break;
            case dobowy:
                cena *= 4.5;
                break;
        }

        System.out.printf("Cena biletu (%s, %s): %.2f zł%n",
                bilet.getRodzaj(), bilet.getCzas(), cena);
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        Bilet b1 = new Bilet(Bilet.Rodzaj.normalny, Bilet.Czas.jedorazowy);
        Bilet b2 = new Bilet(Bilet.Rodzaj.ulgowy, Bilet.Czas.godzinny);
        Bilet b3 = new Bilet(Bilet.Rodzaj.normalny, Bilet.Czas.dobowy);
        Bilet b4 = new Bilet(Bilet.Rodzaj.ulgowy, Bilet.Czas.dobowy);

        kalkulator.obliczCene(b1); // 4.80
        kalkulator.obliczCene(b2); // 3.60
        kalkulator.obliczCene(b3); // 21.60
        kalkulator.obliczCene(b4); // 10.80
    }
}
