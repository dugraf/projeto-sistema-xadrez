package model.entities.boardgame;

public class Board
{
    private int row, column;
    
    private Piece[][] pieces;

    public Board(int row, int column) {
        this.row = row;
        this.column = column;
        pieces = new Piece[row][column];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }


    @Override
    public String toString() {
        String board = "";
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
                board += "[ ]";
            board += "\n";
        }
        return board;
    }

}
