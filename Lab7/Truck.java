class Truck extends Car {
    private int loadCapacity;

    public Truck(String color, String brand, int loadCapacity) {
        super(color, brand);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}