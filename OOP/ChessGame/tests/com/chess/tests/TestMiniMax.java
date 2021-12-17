package com.chess.tests;

import static org.junit.Assert.assertEquals;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.BoardUtils;
import com.chess.engine.board.Move;
import com.chess.engine.pieces.*;
import com.chess.engine.player.MoveStatus;
import com.chess.engine.player.MoveTransition;
import com.chess.engine.player.Player;
import com.chess.engine.player.ai.MiniMax;
import com.chess.engine.player.ai.MoveStrategy;
import org.junit.Ignore;
import org.junit.Test;

public class TestMiniMax {
    static int searchDepth = 4;

    @Test
    public void testOpeningDepth1() {
        final Board board = Board.createStandardBoard();
        final Player currentPlayer = board.currentPlayer();

        final MoveStrategy minMax = new MiniMax(searchDepth);
//        currentPlayer.setMoveStrategy(minMax);
//        board.currentPlayer().getMoveStrategy().execute(board, 1);
//        final long numBoardsEvaluated = minMax.getNumBoardsEvaluated();
//        assertEquals(numBoardsEvaluated, 20L);
    }

    @Test
    public void testOpeningDepth2() {
        final Board board = Board.createStandardBoard();
        final Player currentPlayer = board.currentPlayer();
        final MoveStrategy minMax = new MiniMax(searchDepth);
//        currentPlayer.setMoveStrategy(minMax);
//        board.currentPlayer().getMoveStrategy().execute(board, 2);
//        final long numBoardsEvaluated = minMax.getNumBoardsEvaluated();
//        assertEquals(numBoardsEvaluated, 400L);
    }

    @Test
    public void testOpeningDepth3() {
        final Board board = Board.createStandardBoard();
        final Player currentPlayer = board.currentPlayer();
        final MoveStrategy minMax = new MiniMax(searchDepth);
//        currentPlayer.setMoveStrategy(minMax);
//        board.currentPlayer().getMoveStrategy().execute(board, 3);
//        final long numBoardsEvaluated = minMax.getNumBoardsEvaluated();
//        assertEquals(numBoardsEvaluated, 8902L);
    }

    @Test
    public void testOpeningDepth4() {
        final Board board = Board.createStandardBoard();
        final Player currentPlayer = board.currentPlayer();
        final MoveStrategy minMax = new MiniMax(searchDepth);
//        currentPlayer.setMoveStrategy(minMax);
//        board.currentPlayer().getMoveStrategy().execute(board, 4);
//        final long numBoardsEvaluated = minMax.getNumBoardsEvaluated();
//        assertEquals(numBoardsEvaluated, 197281L);
    }

    @Ignore
    @Test
    public void testOpeningDepth5() {
        final Board board = Board.createStandardBoard();
        final Player currentPlayer = board.currentPlayer();
        final MoveStrategy minMax = new MiniMax(searchDepth);
//        currentPlayer.setMoveStrategy(minMax);
//        board.currentPlayer().getMoveStrategy().execute(board, 4);
//        final long numBoardsEvaluated = minMax.getNumBoardsEvaluated();
//        //assertEquals(numBoardsEvaluated, 4865609L);
//        assertEquals(minMax.getNumAttacks(), 0);
    }

    @Test
    public void testKiwiPeteDepth1() {
        final Board.Builder builder = new Board.Builder();

        // Black Layout
        builder.setPiece(new Rook(Alliance.BLACK, 0));
        builder.setPiece(new King(Alliance.BLACK, 4));
        builder.setPiece(new Rook(Alliance.BLACK, 7));
        builder.setPiece(new Pawn(Alliance.BLACK, 8));
        builder.setPiece(new Pawn(Alliance.BLACK, 10));
        builder.setPiece(new Pawn(Alliance.BLACK, 11));
        builder.setPiece(new Queen(Alliance.BLACK, 12));
        builder.setPiece(new Pawn(Alliance.BLACK, 13));
        builder.setPiece(new Bishop(Alliance.BLACK, 14));
        builder.setPiece(new Bishop(Alliance.BLACK, 16));
        builder.setPiece(new Knight(Alliance.BLACK, 17));
        builder.setPiece(new Pawn(Alliance.BLACK, 20));
        builder.setPiece(new Knight(Alliance.BLACK, 21));
        builder.setPiece(new Pawn(Alliance.BLACK, 22));
        builder.setPiece(new Pawn(Alliance.BLACK, 33));
        builder.setPiece(new Pawn(Alliance.BLACK, 47));

        // White Layout
        builder.setPiece(new Pawn(Alliance.WHITE, 27));
        builder.setPiece(new Knight(Alliance.WHITE, 28));
        builder.setPiece(new Pawn(Alliance.WHITE, 36));

        builder.setPiece(new Knight(Alliance.WHITE, 42));
        builder.setPiece(new Queen(Alliance.WHITE, 45));

        builder.setPiece(new Pawn(Alliance.WHITE, 48));
        builder.setPiece(new Pawn(Alliance.WHITE, 49));
        builder.setPiece(new Pawn(Alliance.WHITE, 50));
        builder.setPiece(new Bishop(Alliance.WHITE, 51));
        builder.setPiece(new Bishop(Alliance.WHITE, 52));
        builder.setPiece(new Pawn(Alliance.WHITE, 53));
        builder.setPiece(new Pawn(Alliance.WHITE, 54));
        builder.setPiece(new Pawn(Alliance.WHITE, 55));

        builder.setPiece(new Rook(Alliance.WHITE, 56));
        builder.setPiece(new King(Alliance.WHITE, 60));
        builder.setPiece(new Rook(Alliance.WHITE, 63));

        // Set the current player
        builder.setMoveMaker(Alliance.WHITE);

        final Board board = builder.build();

        final Player currentPlayer = board.currentPlayer();
        final MoveStrategy minMax = new MiniMax(searchDepth);
//        currentPlayer.setMoveStrategy(minMax);
//        board.currentPlayer().getMoveStrategy().execute(board, 1);
//        final long numBoardsEvaluated = minMax.getNumBoardsEvaluated();
//        assertEquals(numBoardsEvaluated, 48);
//        assertEquals(minMax.getNumAttacks(), 8);
    }

    @Ignore
    @Test
    public void testKiwiPeteDepth2() {
        final Board.Builder builder = new Board.Builder();

        // Black Layout
        builder.setPiece(new Rook(Alliance.BLACK, 0));
        builder.setPiece(new King(Alliance.BLACK, 4));
        builder.setPiece(new Rook(Alliance.BLACK, 7));
        builder.setPiece(new Pawn(Alliance.BLACK, 8));
        builder.setPiece(new Pawn(Alliance.BLACK, 10));
        builder.setPiece(new Pawn(Alliance.BLACK, 11));
        builder.setPiece(new Queen(Alliance.BLACK, 12));
        builder.setPiece(new Pawn(Alliance.BLACK, 13));
        builder.setPiece(new Bishop(Alliance.BLACK, 14));
        builder.setPiece(new Bishop(Alliance.BLACK, 16));
        builder.setPiece(new Knight(Alliance.BLACK, 17));
        builder.setPiece(new Pawn(Alliance.BLACK, 20));
        builder.setPiece(new Knight(Alliance.BLACK, 21));
        builder.setPiece(new Pawn(Alliance.BLACK, 22));
        builder.setPiece(new Pawn(Alliance.BLACK, 33));
        builder.setPiece(new Pawn(Alliance.BLACK, 47));

        // White Layout
        builder.setPiece(new Pawn(Alliance.WHITE, 27));
        builder.setPiece(new Knight(Alliance.WHITE, 28));
        builder.setPiece(new Pawn(Alliance.WHITE, 36));

        builder.setPiece(new Knight(Alliance.WHITE, 42));
        builder.setPiece(new Queen(Alliance.WHITE, 45));

        builder.setPiece(new Pawn(Alliance.WHITE, 48));
        builder.setPiece(new Pawn(Alliance.WHITE, 49));
        builder.setPiece(new Pawn(Alliance.WHITE, 50));
        builder.setPiece(new Bishop(Alliance.WHITE, 51));
        builder.setPiece(new Bishop(Alliance.WHITE, 52));
        builder.setPiece(new Pawn(Alliance.WHITE, 53));
        builder.setPiece(new Pawn(Alliance.WHITE, 54));
        builder.setPiece(new Pawn(Alliance.WHITE, 55));

        builder.setPiece(new Rook(Alliance.WHITE, 56));
        builder.setPiece(new King(Alliance.WHITE, 60));
        builder.setPiece(new Rook(Alliance.WHITE, 63));

        // Set the current player
        builder.setMoveMaker(Alliance.WHITE);

        final Board board = builder.build();

        final Player currentPlayer = board.currentPlayer();
        final MoveStrategy minMax = new MiniMax(searchDepth);
//        currentPlayer.setMoveStrategy(minMax);
//        board.currentPlayer().getMoveStrategy().execute(board, 2);
//        final long numBoardsEvaluated = minMax.getNumBoardsEvaluated();
//        assertEquals(minMax.getNumBoardsEvaluated(), 2039);
        //assertEquals(minMax.getNumAttacks(), 351);
        //assertEquals(minMax.getNumCastles(), 0);
    }

    @Test
    public void testKiwiPeteDebug() {
        final Board.Builder builder = new Board.Builder();

        // Black Layout
        builder.setPiece(new Rook(Alliance.BLACK, 0));
        builder.setPiece(new King(Alliance.BLACK, 4));
        builder.setPiece(new Rook(Alliance.BLACK, 7));
        builder.setPiece(new Pawn(Alliance.BLACK, 8));
        builder.setPiece(new Pawn(Alliance.BLACK, 10));
        builder.setPiece(new Pawn(Alliance.BLACK, 11));
        builder.setPiece(new Queen(Alliance.BLACK, 12));
        builder.setPiece(new Pawn(Alliance.BLACK, 13));
        builder.setPiece(new Bishop(Alliance.BLACK, 14));
        builder.setPiece(new Bishop(Alliance.BLACK, 16));
        builder.setPiece(new Knight(Alliance.BLACK, 17));
        builder.setPiece(new Pawn(Alliance.BLACK, 20));
        builder.setPiece(new Knight(Alliance.BLACK, 21));
        builder.setPiece(new Pawn(Alliance.BLACK, 22));
        builder.setPiece(new Pawn(Alliance.BLACK, 33));
        builder.setPiece(new Pawn(Alliance.BLACK, 47));

        // White Layout
        builder.setPiece(new Pawn(Alliance.WHITE, 27));
        builder.setPiece(new Knight(Alliance.WHITE, 28));
        builder.setPiece(new Pawn(Alliance.WHITE, 36));

        builder.setPiece(new Knight(Alliance.WHITE, 42));
        builder.setPiece(new Queen(Alliance.WHITE, 45));

        builder.setPiece(new Pawn(Alliance.WHITE, 48));
        builder.setPiece(new Pawn(Alliance.WHITE, 49));
        builder.setPiece(new Pawn(Alliance.WHITE, 50));
        builder.setPiece(new Bishop(Alliance.WHITE, 51));
        builder.setPiece(new Bishop(Alliance.WHITE, 52));
        builder.setPiece(new Pawn(Alliance.WHITE, 53));
        builder.setPiece(new Pawn(Alliance.WHITE, 54));
        builder.setPiece(new Pawn(Alliance.WHITE, 55));

        builder.setPiece(new Rook(Alliance.WHITE, 56));
        builder.setPiece(new King(Alliance.WHITE, 60));
        builder.setPiece(new Rook(Alliance.WHITE, 63));

        // Set the current player
        builder.setMoveMaker(Alliance.WHITE);

        final Board board = builder.build();

        assertEquals(board.currentPlayer().getLegalMoves().size(), 48);

        final MoveTransition t1 = board.currentPlayer()
                .makeMove(Move.MoveFactory.createMove(board, BoardUtils.getCoordinateAtPosition("a2"),
                        BoardUtils.getCoordinateAtPosition("a3")));

        assertEquals(MoveStatus.DONE, t1.getMoveStatus());

        final MoveStrategy minMax = new MiniMax(searchDepth);
//        t1.getTransitionBoard().currentPlayer().setMoveStrategy(minMax);
//        t1.getTransitionBoard().currentPlayer().getMoveStrategy().execute(board, 1);

//        assertEquals(t1.getTransitionBoard().currentPlayer().getLegalMoves().size(), 44);
    }

    @Test
    public void testPosition3Depth1() {
        final Board.Builder builder = new Board.Builder();

        // Black Layout
        builder.setPiece(new Pawn(Alliance.BLACK, 10));
        builder.setPiece(new Pawn(Alliance.BLACK, 19));
        builder.setPiece(new Rook(Alliance.BLACK, 31));
        builder.setPiece(new Pawn(Alliance.BLACK, 37));
        builder.setPiece(new King(Alliance.BLACK, 39));

        // White Layout
        builder.setPiece(new King(Alliance.WHITE, 24));
        builder.setPiece(new Pawn(Alliance.WHITE, 25));
        builder.setPiece(new Rook(Alliance.WHITE, 33));

        builder.setPiece(new Pawn(Alliance.WHITE, 52));
        builder.setPiece(new Pawn(Alliance.WHITE, 54));

        // Set the current player
        builder.setMoveMaker(Alliance.WHITE);

        final Board board = builder.build();

        final Player currentPlayer = board.currentPlayer();
        final MoveStrategy minMax = new MiniMax(searchDepth);
//        currentPlayer.setMoveStrategy(minMax);
//        board.currentPlayer().getMoveStrategy().execute(board, 1);
//        final long numBoardsEvaluated = minMax.getNumBoardsEvaluated();
//        assertEquals(numBoardsEvaluated, 14);
//        assertEquals(minMax.getNumAttacks(), 1);
//        assertEquals(minMax.getNumCastles(), 0);
    }

    @Ignore
    @Test
    public void testPosition3Depth2() {
        final Board.Builder builder = new Board.Builder();

        // Black Layout
        builder.setPiece(new Pawn(Alliance.BLACK, 10));
        builder.setPiece(new Pawn(Alliance.BLACK, 19));
        builder.setPiece(new Rook(Alliance.BLACK, 31));
        builder.setPiece(new Pawn(Alliance.BLACK, 37));
        builder.setPiece(new King(Alliance.BLACK, 39));

        // White Layout
        builder.setPiece(new King(Alliance.WHITE, 24));
        builder.setPiece(new Pawn(Alliance.WHITE, 25));
        builder.setPiece(new Rook(Alliance.WHITE, 33));

        builder.setPiece(new Pawn(Alliance.WHITE, 52));
        builder.setPiece(new Pawn(Alliance.WHITE, 54));

        // Set the current player
        builder.setMoveMaker(Alliance.WHITE);

        final Board board = builder.build();

        final Player currentPlayer = board.currentPlayer();
        final MoveStrategy minMax = new MiniMax(searchDepth);
//        currentPlayer.setMoveStrategy(minMax);
//        board.currentPlayer().getMoveStrategy().execute(board, 2);
//        final long numBoardsEvaluated = minMax.getNumBoardsEvaluated();
//        assertEquals(numBoardsEvaluated, 191);
//        assertEquals(minMax.getNumAttacks(), 14);
//        assertEquals(minMax.getNumCastles(), 0);
    }

}
