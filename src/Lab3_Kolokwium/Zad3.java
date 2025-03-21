import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(compare(a, b));

    }

    public static int compare(int a, int b)
    {

        if(b>a)
        {
            return 1;
        }
        else if(a>b)
        {
            return -1;
        }
        else if(a==b)
        {
            return 0;
        }
        return a;
    }
}
