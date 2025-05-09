public class Prostokat {
    int a,b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;

        int obwod =  2*a + 2*b;
        int pole = a*b;

        System.out.println("obwod = " + obwod);
        System.out.println("pole = " + pole);
    }

    public Prostokat(int a)
    {
        this.a = a;
        this.b = a;

        int obwod =  4*a;
        int pole = a*a;

        System.out.println("obwod = " + obwod);
        System.out.println("pole = " + pole);
    }

    public static void main(String[] args) {
        Prostokat prostokat1 = new Prostokat(2);
        System.out.println("------");
        Prostokat prostokat2 = new Prostokat(4,3);

    }
}
