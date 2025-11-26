package SnakesAndLadders;

public class BoardSquare {
    private Mover mover; //

    // Constructor
    public BoardSquare(Mover mover) {
        this.mover = mover;
    }

  
    public void displayMessage() {
        mover.showMessage();  
    }

}
