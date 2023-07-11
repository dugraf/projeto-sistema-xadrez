package model.entities.boardgame;

public class Piece
{
    protected Position position;
    private Board board;

    public Piece(Board board)
    {
        this.board = board;
        position = null;
    }

    protected Board getBoard()
    {
        return board;
    }

    public boolean[][] possibleMoves()
    {

    }

    public boolean possibleMove(Position position)
    {
        if(position.getRow() > 0 && position.getRow() <= board.getRow())
            return true;
        if(position.getColumn() > 0 && position.getColumn() <= board.getColumn())
            return true;
        return false;
    }

    public boolean isThereAnyPossibleMove()
    {
        
    }
}
