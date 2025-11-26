package snakeandladders;

public class EjerciciosFinCapitulo7 {

    public static void main(String[] args) {

        FullAdder4Bit adder = new FullAdder4Bit();

        // Sumar 1011 (11) + 0101 (5)

        int[] A = {1, 1, 0, 1}; // LSB primero
        int[] B = {1, 0, 1, 0};

        adder.setInput(A, B, 0);

        int[] S = adder.getSum();  // <-- corregido
        int Cout = adder.getCarryOut();

        System.out.print("Resultado: ");
        for (int i = 3; i >= 0; i--)
            System.out.print(S[i]);

        System.out.println("\nCarry final: " + Cout);
    }
}

