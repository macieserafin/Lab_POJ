public class MyCircle {
    private double radius;

    public MyCircle(double r)
    {
        this.radius = r;
    }

    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    public double circleArea()
    {
        return Math.PI*radius*radius;
    }

    public double calculateDiameter(){
        return 2 * radius;
    }
}
