package course;

/**
 * Utility to generate one I Ching line based on 3 coin flips.
 */
public class IChingLine {

    /**
     * Returns the textual representation of a hexagram line by flipping 3 coins.
     * @return A string representing the line
     */
    public static String generateLine() {
        Coin c1 = new Coin();
        Coin c2 = new Coin();
        Coin c3 = new Coin();

        int heads = 0;
        if ("heads".equals(c1.getFace())) heads++;
        if ("heads".equals(c2.getFace())) heads++;
        if ("heads".equals(c3.getFace())) heads++;

        return switch (heads) {
            case 3 -> "Old Yang line      ---- o ----";
            case 0 -> "Old Yin line       ---- x ----";
            case 2 -> "Young Yang line    -----------";
            case 1 -> "Young Yin line     ---- ----";
            default -> "Unknown";
        };
    }
}
