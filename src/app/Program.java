package app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import input.Input;
import model.entities.chess.ChessException;
import model.entities.chess.ChessMatch;
import model.entities.chess.ChessPiece;
import model.entities.chess.ChessPosition;

public class Program
{
    public static void main(String[] args)
    {
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();
        while(true)
        {
            try
            {
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                System.out.println();
                ChessPosition source = UI.readChessPosition(Input.inputString("Source: "));

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                ChessPosition target = UI.readChessPosition(Input.inputString("Target: "));
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                if(capturedPiece != null)
                    captured.add(capturedPiece);
            }
            catch(ChessException e)
            {
                System.out.println(e.getMessage());
                Input.inputString(Input.nextLine());
            }
            catch(InputMismatchException e)
            {
                System.out.println(e.getMessage());
                Input.inputString(Input.nextLine());
            }
        }
    }
}
