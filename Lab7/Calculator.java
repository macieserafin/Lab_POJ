public class Calculator {

    public int calculate(int a) {
        return a * a;
    }

    public int calculate(int a, int b) {
        return a * b;
    }

    public int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Kwadrat z 4: " + calc.calculate(4));                 // 16
        System.out.println("Mnożenie 3 i 5: " + calc.calculate(3, 5));           // 15
        System.out.println("Suma 1, 2, 3: " + calc.calculate(1, 2, 3));          // 6
    }
}
