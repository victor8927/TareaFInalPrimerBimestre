package snakeandladders;

public class PlayerPiece {
	
	private String color;
    private BoardSquare currentPosition;

    public PlayerPiece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setCurrentPosition(BoardSquare pos) {
        currentPosition = pos;
    }

    public BoardSquare getCurrentPosition() {
        return currentPosition;
    }

    public void moveTo(BoardSquare pos) {
        pos.movePlayerPiece(this);
    }
}
