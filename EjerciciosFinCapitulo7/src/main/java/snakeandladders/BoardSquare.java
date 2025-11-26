package snakeandladders;

public class BoardSquare {
	private Snake aSnake = null;
    private Ladder aLadder = null;
    private int position;

    BoardSquare(int position) {
        setPosition(position);
    }

    int getPosition() {
        return position;
    }

    private void setPosition(int position) {
        this.position = position;
    }

    void addSnake(Snake s) {
        aSnake = s;
    }

    void addLadder(Ladder l) {
        aLadder = l;
    }

    private boolean hasSnake() {
        return aSnake != null;
    }

    private boolean hasLadder() {
        return aLadder != null;
    }

    public void movePlayerPiece(PlayerPiece counter) {
        counter.setCurrentPosition(this);

        if (hasSnake()) {
            aSnake.movePlayerPiece(counter);
        }

        if (hasLadder()) {
            aLadder.movePlayerPiece(counter);
        }
    }
}
