package snakeandladders;

public class FullAdder {

    HalfAdder ha1 = new HalfAdder();
    HalfAdder ha2 = new HalfAdder();
    OrGate orGate = new OrGate();

    private int sum;
    private int carryOut;

    public void setInput(int a, int b, int cin) {

        // Primer half-adder
        ha1.setInput(a, b);
        int s1 = ha1.getResult();
        int c1 = ha1.getCarry();

        // Segundo half-adder
        ha2.setInput(s1, cin);
        int s2 = ha2.getResult();
        int c2 = ha2.getCarry();

        // Carry final es OR de los dos carries
        carryOut = orGate.getOutput(c1, c2);
        sum = s2;
    }

    public int getSum() {
        return sum;
    }

    public int getCarry() {
        return carryOut;
    }
}
