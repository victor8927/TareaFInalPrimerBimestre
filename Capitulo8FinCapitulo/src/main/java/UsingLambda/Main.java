package UsingLambda;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IAverage meanCalculator = (double[] numbers) -> {
            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }
            return sum / numbers.length;
        };

        IAverage medianCalculator = (double[] numbers) -> {
            Arrays.sort(numbers);
            int middle = numbers.length / 2;
            if (numbers.length % 2 == 0) {
                return (numbers[middle - 1] + numbers[middle]) / 2.0;
            } else {
                return numbers[middle];
            }
        };

        double[] numbers = {10.5, 20.5, 30.0, 40.0};
        System.out.println("Mean: " + meanCalculator.getAverage(numbers));
        System.out.println("Median: " + medianCalculator.getAverage(numbers));
    }
}