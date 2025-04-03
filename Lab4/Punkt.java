import static java.lang.Math.sqrt;

public class Punkt {
    private double x,y;

    public Punkt()
    {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double odlPunktu(double x, double y)
    {
        return sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));

    }

    public double odlPunktuOdPunktu(Punkt innyPunkt)
    {
        double Dx = this.x - innyPunkt.x;
        double Dy = this.y - innyPunkt.y;
        return sqrt(Dx * Dx + Dy * Dy);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}

