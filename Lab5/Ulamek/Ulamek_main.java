package Ulamek;

public class Ulamek_main {
    public static void main(String[] args) {
        Ulamek u1 = new Ulamek(3, 4);
        Ulamek u2 = new Ulamek(2, 5);

        Ulamek suma = u1.dodaj(u2);
        Ulamek roznica = u1.odejmij(u2);
        Ulamek iloczyn = u1.mnoz(u2);
        Ulamek iloraz = u1.dziel(u2);

        System.out.print("Suma: ");
        suma.wyswietl();

        System.out.print("Różnica: ");
        roznica.wyswietl();

        System.out.print("Iloczyn: ");
        iloczyn.wyswietl();

        System.out.print("Iloraz: ");
        iloraz.wyswietl();
    }
}
