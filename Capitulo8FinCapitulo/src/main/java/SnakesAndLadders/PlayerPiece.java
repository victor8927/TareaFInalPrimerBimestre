package SnakesAndLadders;

public class PlayerPiece {
    private int position;

    public PlayerPiece() {
        this.position = 0;  
    }

    public void moveTo(BoardSquare square) {
        square.displayMessage();
        
    }
}
