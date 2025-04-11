package Rzut_Monetą;
import java.util.Random;

public class Coin {
    private static final Random random = new Random();

    public enum CoinSide {
        ORZEŁ, RESZKA
    }

    public static CoinSide rzut()
    {
        if (random.nextBoolean()) {
            return CoinSide.ORZEŁ;
        } else {
            return CoinSide.RESZKA;
        }
    }

}
