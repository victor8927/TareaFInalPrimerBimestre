package snakeandladders;

public class HalfAdderTest
	{
	public static void main(String[] args)
	{
		// declare a half adder
		HalfAdder halfAdder = new HalfAdder();
		// set the input to the half adder
		halfAdder.setInput(1, 0);
		// display the resulting output from the half adder
		System.out.println("Input to the half adder is 1, 0");
		System.out.println("Result from half adder is "
				+ halfAdder.getResult());
		System.out.println("Carry value from half adder is "
				+ halfAdder.getCarry());
		// set the input to the half adder
		halfAdder.setInput(0, 0);
		// display the resulting output from the half adder
		System.out.println("Input to the half adder is 0, 0");
		System.out.println("Result from half adder is "
				+ halfAdder.getResult());
		System.out.println("Carry value from half adder is "
				+ halfAdder.getCarry());
		// set the input to the half adder
		halfAdder.setInput(1, 1);
		// display the resulting output from the half adder
		System.out.println("Input to the half adder is 1, 1");
		System.out.println("Result from half adder is "
				+ halfAdder.getResult());
		System.out.println("Carry value from half adder is "
				+ halfAdder.getCarry());
		}
	}