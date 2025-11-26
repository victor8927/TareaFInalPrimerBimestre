package snakeandladders;

public class SnakesAndLadders {
	  private GameBoard board = new GameBoard();

	    public void play() {

	        PlayerPiece red = new PlayerPiece("Red");
	        PlayerPiece blue = new PlayerPiece("Blue");

	        red.setCurrentPosition(board.getStartSquare());
	        blue.setCurrentPosition(board.getStartSquare());

	        boolean gameOver = false;

	        while (!gameOver) {

	            // Turno del rojo
	            board.movePlayerPiece(red);
	            if (red.getCurrentPosition().getPosition() == GameBoard.MAX_SQUARES) {
	                System.out.println("🚩 Red wins the game!");
	                break;
	            }

	            // Turno del azul
	            board.movePlayerPiece(blue);
	            if (blue.getCurrentPosition().getPosition() == GameBoard.MAX_SQUARES) {
	                System.out.println("🚩 Blue wins the game!");
	                break;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        SnakesAndLadders game = new SnakesAndLadders();
	        game.play();
	    }
}
