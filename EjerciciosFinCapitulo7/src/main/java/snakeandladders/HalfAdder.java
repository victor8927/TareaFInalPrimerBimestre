package snakeandladders;

public class HalfAdder {
	AndGate carryAndGate = new AndGate();
	AndGate resultAndGate = new AndGate();
	OrGate orGate = new OrGate();
	NotGate notGate = new NotGate();
	// inputs to the half adder
	private int input1;
	private int input2;
	// outputs from the half adder
	private int result;
	private int carry;
	// set the values of the input bits
	public void setInput(int in1, int in2) {
		input1 = in1;
		input2 = in2;
		// get the carry value
		carry = carryAndGate.getOutput(input1, input2);
		// get the result value
		result = resultAndGate.getOutput
				(orGate.getOutput(input1, input2),
						notGate.getOutput(carry));
	}
	// return the result bit
	public int getResult() {
		return result;
	}
	// return the carry bit
	public int getCarry() {
		return carry;
		}
	}
