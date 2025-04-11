package Zgadnij_Liczbe;

import java.util.Random;
import java.util.Scanner;

public class GamePanel {

    public int minNum;
    public int maxNum;

    int trys = 5;
    boolean gamewon = false;


    public GamePanel(int minNum, int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
    }

    public int GetRandomNum() {
        Random rand = new Random();
        return rand.nextInt((maxNum - minNum) + 1) + minNum;
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zaczynamy grę!");
        System.out.println("Zakres liczb: " + minNum + " - " + maxNum);

        int random = GetRandomNum();

        while (trys > 0 && !gamewon) {

            System.out.println("Podaj liczbę.");

            int userGuess = Integer.parseInt(sc.nextLine());

            if(userGuess > maxNum || userGuess < minNum) {
                System.out.println("Liczba nie mieści się w zakresie.");
            }
            if (userGuess > random && userGuess < maxNum) {
                System.out.println("Za duża!");
                trys --;
                System.out.println("Zostało " + trys + " prób.");
            }
            if (userGuess < random && userGuess > minNum) {
                System.out.println("Za mała!");
                trys --;
                System.out.println("Zostało " + trys + " prób.");
            }
            if (userGuess == random) {
                System.out.println("Zgadłeś!");
                gamewon = true;
            }
        }

        if (trys <= 0)
        {
            System.out.println("Przegrałeś ! Liczba to: " + random);
        }


    }

}
