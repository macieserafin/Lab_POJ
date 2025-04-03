public class Wiatrak {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    double speed;
    boolean on;
    double radius;
    String color;

    public Wiatrak()
    {
        speed = SLOW;
        on = true;
        radius = 2;
        color = "black";
    }
    public Wiatrak(double Speed, boolean On, double Radius, String Color)
    {
        this.speed = Speed;
        this.on = On;
        this.radius = Radius;
        this.color = Color;
    }

    public String informacje()
    {
        if (on) {
            return "Wiatrak jest włączony, prędkość: " + speed +
                    ", kolor: " + color +
                    ", promień: " + radius;
        } else {
            return "Wiatrak jest wyłączony, kolor: " + color +
                    ", promień: " + radius;
        }
    }


}
