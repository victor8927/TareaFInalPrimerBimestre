package Average;

public class IAverageMain {
	   public static void main(String[] args) {
	        AverageCalculator calculator = new AverageCalculator();
	        double[] numbers = {10.5, 20.5, 30.0, 40.0};
	        System.out.println("Mean: " + calculator.getMean(numbers));
	    }
}
