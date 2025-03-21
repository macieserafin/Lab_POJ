import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a  = sc.nextLine();
        System.out.println(reverseWorlds(a));

    }

    static String reverseWorlds(String str)
    {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        return rev;
    }
}
