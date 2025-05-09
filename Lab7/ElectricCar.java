class ElectricCar extends Car {
    private int batteryRange;

    public ElectricCar(String color, String brand, int batteryRange) {
        super(color, brand);
        this.batteryRange = batteryRange;
    }

    public int getBatteryRange() {
        return batteryRange;
    }
}