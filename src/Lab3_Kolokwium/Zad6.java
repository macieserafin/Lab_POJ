import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Wprowadź " + size + " elementów do tablicy:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        Boolean answ;
        if(sum % 5 == 0)
        {
            answ = true;
        }
        else
        {
            answ = false;
        }

        System.out.println("Suma: " + sum);
        System.out.println(answ);

    }
}
