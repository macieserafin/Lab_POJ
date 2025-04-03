public class Main {
    public static void main(String[] args) {

        //ZAD 1

        System.out.println("ZAD 1");

        int[] a = {101,20,30};
        int[] b = {10,20,30, 60};

        int [] wynik = Metoda(a, b);

        for (int i = 0; i < wynik.length; i++) {
            System.out.println(wynik[i]);
        }

        //ZAD 2

        System.out.println("ZAD 2");

        Kwadrat sq = new Kwadrat(5);

        System.out.println(sq.Pole());
        System.out.println(sq.Obw());

        //ZAD 3

        System.out.println("ZAD 3");

        Punkt p0 = new Punkt();
        Punkt p1 = new Punkt(1, 2);
        Punkt p2 = new Punkt(4, 6);

        System.out.println("Punkt (" + p0.getX() + ", " + p0.getY() + ")");
        System.out.println("Punkt (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Punkt (" + p2.getX() + ", " + p2.getY() + ")");

        System.out.println("Odleglosc od punktu 1 do 2 = " + p1.odlPunktuOdPunktu(p2));
        System.out.println("Odleglosc od punkty 1 do punktu (2.0,5.0) = " + p1.odlPunktu(2,5));

        //ZAD 4

        System.out.println("ZAD 4");

        MyCircle Circle = new MyCircle(5);

        System.out.println("Radius = 5");
        System.out.println("Pole = " + Circle.circleArea());
        System.out.println("Obwod = " + Circle.circumference());
        System.out.println("Srednica = " + Circle.calculateDiameter());

        //ZAD 5

        System.out.println("ZAD 5");

        Wiatrak wiatrak = new Wiatrak();
        Wiatrak wiatrak2 = new Wiatrak(Wiatrak.FAST, true, 2, "czerwony");

        System.out.println(wiatrak.informacje());
        System.out.println(wiatrak2.informacje());


    }

    public static int[] Metoda(int[] tab1, int[] tab2)
    {
        if(tab1.length == tab2.length) {
            int[] tab = new int[tab1.length];

            for (int i = 0; i < tab1.length; i++) tab[i] = tab1[i] + tab2[i];
            return tab;
        }
        return new int[0];

    }

}