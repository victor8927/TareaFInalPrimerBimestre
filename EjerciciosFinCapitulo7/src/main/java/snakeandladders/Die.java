package snakeandladders;
import java.util.Random;

/**
 * Simple die implementation that returns 1..6
 */
class Die {
    private final Random rand = new Random();

    int roll() {
        return rand.nextInt(6) + 1; // 1..6
    }
}