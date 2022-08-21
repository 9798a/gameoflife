import model.Board;
import utils.Matrix;

public class Gameoflife {

    public static void main(String[] args) throws InterruptedException {
        Board board = new Board();
        board.setCell(2,2,true);
        board.setCell(2,3, true);
        board.setCell(2,4, true);
        Matrix.printMatrix(board.getBoard());
        board.next();
        Matrix.printMatrix(board.getBoard());
        /*while(true){
            board.next();
            Matrix.printMatrix(board.getBoard());
            Thread.sleep(2000);
            System.out.println("");
        }*/
    }

}
