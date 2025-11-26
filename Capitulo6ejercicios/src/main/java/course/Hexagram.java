package course;

/**
 * Represents a complete I Ching hexagram made of 6 lines.
 */
public class Hexagram {
	private final String[] lines = new String[6];

    /**
     * Generates a full hexagram (6 lines).
     */
    public Hexagram() {
        for (int i = 0; i < 6; i++) {
            lines[i] = IChingLine.generateLine();
        }
    }

    /**
     * Displays the full hexagram (top to bottom).
     */
    public void display() {
        System.out.println("=== Generated Hexagram ===");
        for (int i = 5; i >= 0; i--) { // top line printed last
            System.out.println(lines[i]);
        }
    }
}
