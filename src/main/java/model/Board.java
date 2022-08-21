package model;

import model.rule.RuleManager;

public class Board {

    private final int X = 8;
    private final int Y = 8;

    private boolean[][] board = new boolean[X][Y];

    private final RuleManager ruleManager = new RuleManager();

    public void setCell(int x, int y, boolean state){
        board[y][x] = state;
    }

    public void next(){
        this.board = ruleManager.check(board);
    }

    public boolean[][] getBoard() {
        return board.clone();
    }
}
