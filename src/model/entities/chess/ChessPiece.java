package model.entities.chess;

import model.entities.boardgame.Board;
import model.entities.boardgame.Piece;

public class ChessPiece extends Piece
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

    public ChessPosition getChessPosition()
    {
        
    }
}
