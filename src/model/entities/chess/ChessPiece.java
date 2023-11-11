package model.entities.chess;

import model.entities.boardgame.Board;
import model.entities.boardgame.Piece;
import model.entities.boardgame.Position;

public abstract class ChessPiece extends Piece
{
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public ChessPosition getChessPosition()
    {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position)
    {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

    public void increaseMoveCount()
    {
        moveCount++;
    }

    public void decreaseMoveCount()
    {
        moveCount--;
    }
}