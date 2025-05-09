class SportsCar extends Car {
    private double acceleration;

    public SportsCar(String color, String brand, double acceleration) {
        super(color, brand);
        this.acceleration = acceleration;
    }

    public double getAcceleration() {
        return acceleration;
    }
}