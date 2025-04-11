package Zgadnij_Liczbe;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            System.out.println("                                                                    ");
            System.out.println("=== Gra: Zgadnij Liczbę ===");
            System.out.println("1. Podaj zakres liczb (od - do).");
            System.out.println("2. Komputer wylosuje jedną liczbę z tego zakresu.");
            System.out.println("3. Masz 5 prób, by ją zgadnąć.");
            System.out.println("4. Po każdej próbie dostaniesz podpowiedź:");
            System.out.println("   - 'Za mała' jeśli liczba jest za niska");
            System.out.println("   - 'Za duża' jeśli liczba jest za wysoka");
            System.out.println("5. Po 5 nieudanych próbach przegrywasz.");
            System.out.println("===============================");
            System.out.println("                                                                    ");
            System.out.println("Press enter to continue...");
            answer = sc.nextLine();
        } while (!answer.isEmpty());

        boolean validInput = false;
        int minNum = 0;
        int maxNum = 0;

        System.out.println(" Zakres: Podaj najmniejsza liczbę");
        minNum = Integer.parseInt(sc.nextLine());

        while (!validInput) {
            System.out.println(" Zakres: Podaj największą liczbę");
            maxNum = Integer.parseInt(sc.nextLine());

            if (maxNum > minNum) {
                validInput = true;
            }else{System.out.println("(Liczba musi być większa od minimalnej!)");}
        }

        GamePanel gamePanel = new GamePanel(minNum, maxNum);

        gamePanel.startGame();



    }



}
