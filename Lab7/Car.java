public class Car {
    protected String color;
    protected String brand;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public String getInformation() {
        return "Marka: " + brand + ", Kolor: " + color;
    }

    public static void main(String[] args) {
        Car tesla = new ElectricCar("Czarny", "Tesla", 500);
        Car ferrari = new SportsCar("Czerwony", "Ferrari", 3.2);
        Car volvo = new Truck("Biały", "Volvo", 8000);

        Car[] cars = {tesla, ferrari, volvo};

        for (Car car : cars) {
            System.out.println(car.getInformation());
        }
    }
}