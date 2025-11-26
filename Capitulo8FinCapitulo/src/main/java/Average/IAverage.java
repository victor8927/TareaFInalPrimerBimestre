package Average;

public interface IAverage {
    private double calculateMean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    default double getMean(double[] numbers) {
        return calculateMean(numbers);
    }
}
