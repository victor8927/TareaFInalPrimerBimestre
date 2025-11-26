package course;

public class IChingTest {
	
	public static void main(String[] args) {

        // Test 6.5 Coin
        System.out.println("=== Testing Coin ===");
        Coin coin = new Coin();
        System.out.println("Coin flip: " + coin.getFace());

        // Test 6.6 One line
        System.out.println("\n=== Testing I Ching line ===");
        System.out.println(IChingLine.generateLine());

        // Test 6.7 Full Hexagram
        System.out.println("\n=== Testing Full Hexagram ===");
        Hexagram hex = new Hexagram();
        hex.display();

        // Example usage of "var"
        var example = new Coin();  
        System.out.println("\nUsing var example flip: " + example.getFace());
    }
}
