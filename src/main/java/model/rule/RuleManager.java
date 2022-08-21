package model.rule;

public class RuleManager {

    public boolean[][] check(boolean[][] board){
        boolean[][] nextState = board.clone();

        for(int x = 1; x < board.length-1;x++) {
            for(int y = 1; y < board[x].length-1; y++){
                nextState[x][y] = isAlive(x, y, board);
            }
        }

        return nextState;
    }

    private boolean isAlive(int x, int y, boolean[][] board){
        int neighborAlive = 0;

        for(int i = x-1; i <= x+1;i++) {
            for(int j = y-1; j <= y+1; j++){
                if(i != x && j != y){
                    if(board[i][j]) neighborAlive++;
                }
            }
        }
        System.out.printf("%s X: %s Y: %s \n", neighborAlive, x, y);
        if(board[x][y]){
            return neighborAlive != 3 && neighborAlive != 2;
        }
        else{
            return neighborAlive == 3;
        }
    }
}
