package snakeandladders;

public class FullAdder4Bit {

    FullAdder fa0 = new FullAdder();
    FullAdder fa1 = new FullAdder();
    FullAdder fa2 = new FullAdder();
    FullAdder fa3 = new FullAdder();

    private int[] sum = new int[4];
    private int carryOut;

    // a[0] es el bit menos significativo
    public void setInput(int[] a, int[] b, int cin) {

        // Bit 0
        fa0.setInput(a[0], b[0], cin);
        sum[0] = fa0.getSum();
        int c1 = fa0.getCarry();

        // Bit 1
        fa1.setInput(a[1], b[1], c1);
        sum[1] = fa1.getSum();
        int c2 = fa1.getCarry();

        // Bit 2
        fa2.setInput(a[2], b[2], c2);
        sum[2] = fa2.getSum();
        int c3 = fa2.getCarry();

        // Bit 3
        fa3.setInput(a[3], b[3], c3);
        sum[3] = fa3.getSum();
        carryOut = fa3.getCarry();
    }

    public int[] getSum() {
        return sum;
    }

    public int getCarryOut() {
        return carryOut;
    }
}