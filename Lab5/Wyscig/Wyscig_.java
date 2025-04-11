package Wyscig;

public class Wyscig_ {
    public static void main(String[] args) {
        Zawodnik z1 = new Zawodnik("Robert", 2, 12);
        Zawodnik z2 = new Zawodnik("Anna", 3, 10);
        Zawodnik z3 = new Zawodnik("Tomasz", 4, 11);

        z1.przedstawSie();
        z2.przedstawSie();
        z3.przedstawSie();

        boolean zwyciezcaWybrany = false;
        Zawodnik zwyciezca = null;

        while (!zwyciezcaWybrany) {
            z1.biegnij();
            z2.biegnij();
            z3.biegnij();

            if (z1.pokonanaOdleglosc >= 50) {
                zwyciezca = z1;
                zwyciezcaWybrany = true;
            } else if (z2.pokonanaOdleglosc >= 50) {
                zwyciezca = z2;
                zwyciezcaWybrany = true;
            } else if (z3.pokonanaOdleglosc >= 50) {
                zwyciezca = z3;
                zwyciezcaWybrany = true;
            }
        }

        System.out.println("\nZwycięzca:");
        zwyciezca.przedstawSie();
        System.out.println("Pokonałem dystans: " + zwyciezca.pokonanaOdleglosc + " km");
    }
}
