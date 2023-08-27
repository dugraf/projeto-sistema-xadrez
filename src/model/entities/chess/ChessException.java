package model.entities.chess;

import model.entities.boardgame.BoardException;

public class ChessException extends BoardException
{
    public ChessException(String msg)
    {
        super(msg);
    }
}
