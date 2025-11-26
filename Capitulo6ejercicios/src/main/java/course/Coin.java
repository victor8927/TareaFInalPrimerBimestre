package course;

import java.util.Random;

public class Coin {
	/**
	 * Represents a coin that can be overturned to return heads or tails.
	 */
	
	private static final Random rand = new Random();

    /**
     * Simulates the flipping of a coin.
     * @return "heads" or "tails"
     */
    public String getFace() {
        return rand.nextBoolean() ? "heads" : "tails";
    }
	
	
	
}
