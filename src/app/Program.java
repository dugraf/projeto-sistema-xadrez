package app;

import input.Input;
import model.entities.boardgame.Board;
import model.entities.chess.ChessMatch;
import model.entities.chess.ChessPiece;
import model.entities.chess.ChessPosition;

public class Program
{
    public static void main(String[] args)
    {
        ChessMatch chessMatch = new ChessMatch();
        while(true)
        {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            ChessPosition source = UI.readChessPosition(Input.inputString("Source: "));
            ChessPosition target = UI.readChessPosition(Input.inputString("Target: "));
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}
