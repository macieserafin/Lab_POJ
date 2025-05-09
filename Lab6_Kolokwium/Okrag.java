public class Okrag {
    Punkt srodek;
    double promien;
    Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;

        System.out.println("Okrąg to: " + "Punkt: " + srodek.x + ", " + srodek.y + " promien: " + promien);

    }

    public boolean check(Punkt punkt)
    {

        double x = (punkt.x - srodek.x)*(punkt.x - srodek.x) + (punkt.y - srodek.y)*(punkt.y - srodek.y);
        if (x == promien*promien)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static void main(String[] args) {
        Punkt srodek = new Punkt(4,6);
        Punkt punkt = new Punkt(3,5);
        Okrag okrag = new Okrag(srodek, 2);

        System.out.println(okrag.check(punkt));
    }
}


