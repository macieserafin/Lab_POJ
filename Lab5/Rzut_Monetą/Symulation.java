package Rzut_Monetą;

import java.util.Scanner;

public class Symulation {



    public static void main(String[] args) {

    System.out.println("Witaj w symulacji rzutu monetą !");
    System.out.println("Ile prob chcesz wykonać?");

    Scanner sc = new Scanner(System.in);
    int attemps = Integer.parseInt(sc.nextLine());

    int orzel = 0, reszka = 0;

    for (int i = 0; i < attemps; i++) {
        Coin.CoinSide wynik = Coin.rzut();
        if(wynik == Coin.CoinSide.ORZEŁ)
        {
            orzel ++;
        }
        else{
            reszka ++;
        }
    }

    double orzelProcentage = (double) orzel / attemps * 100;
    double reszkaProcentage = (double) reszka / attemps * 100;
    System.out.println("Orzel: " + orzelProcentage);
    System.out.println("Reszka: " + reszkaProcentage);



    }
}
