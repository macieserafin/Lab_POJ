package Ulamek;

public class Ulamek {
    private int licznik;
    private int mianownik;

    public Ulamek(int licznik, int mianownik) {
        if (mianownik == 0) {
            throw new IllegalArgumentException("Mianownik nie może być zerem.");
        }
        if (mianownik < 0) {
            licznik = -licznik;
            mianownik = -mianownik;
        }
        int nwd = nwd(Math.abs(licznik), mianownik);
        this.licznik = licznik / nwd;
        this.mianownik = mianownik / nwd;
    }

    private int nwd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public Ulamek dodaj(Ulamek inny) {
        int nowyLicznik = this.licznik * inny.mianownik + inny.licznik * this.mianownik;
        int nowyMianownik = this.mianownik * inny.mianownik;
        return new Ulamek(nowyLicznik, nowyMianownik);
    }

    public Ulamek odejmij(Ulamek inny) {
        int nowyLicznik = this.licznik * inny.mianownik - inny.licznik * this.mianownik;
        int nowyMianownik = this.mianownik * inny.mianownik;
        return new Ulamek(nowyLicznik, nowyMianownik);
    }

    public Ulamek mnoz(Ulamek inny) {
        return new Ulamek(this.licznik * inny.licznik, this.mianownik * inny.mianownik);
    }

    public Ulamek dziel(Ulamek inny) {
        if (inny.licznik == 0) {
            throw new ArithmeticException("Nie można dzielić przez zero.");
        }
        return new Ulamek(this.licznik * inny.mianownik, this.mianownik * inny.licznik);
    }

    public void wyswietl() {
        System.out.println(licznik + "/" + mianownik);
    }
}
