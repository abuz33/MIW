package com.chess.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Board.*;
import com.chess.engine.board.BoardUtils;
import com.chess.engine.board.Move;
import com.chess.engine.board.Move.*;
import com.chess.engine.pieces.*;
import com.chess.engine.player.MoveStatus;
import com.chess.engine.player.MoveTransition;
import org.junit.Test;

//import com.chess.engine.classic.Alliance;
//import com.chess.engine.classic.board.Board;
//import com.chess.engine.classic.board.Board.Builder;
//import com.chess.engine.classic.board.Board.MoveStatus;
//import com.chess.engine.classic.board.BoardUtils;
//import com.chess.engine.classic.board.Move.MoveFactory;
//import com.chess.engine.classic.board.MoveTransition;
//import com.chess.engine.classic.pieces.Bishop;
//import com.chess.engine.classic.pieces.King;
//import com.chess.engine.classic.pieces.Pawn;

public class TestStaleMate {
    @Test
    public void testAnandKramnikStaleMate() {

        final Board.Builder builder = new Builder();
        // Black Layout
        builder.setPiece(new Pawn(Alliance.BLACK, 14));
        builder.setPiece(new Pawn(Alliance.BLACK, 21));
        builder.setPiece(new King(Alliance.BLACK, 36));
        // White Layout
        builder.setPiece(new Pawn(Alliance.WHITE, 29));
        builder.setPiece(new King(Alliance.WHITE, 31));
        builder.setPiece(new Pawn(Alliance.WHITE, 39));
        // Set the current player
        builder.setMoveMaker(Alliance.BLACK);

        final Board board = builder.build();

        assertFalse(board.currentPlayer().isInStaleMate());

        final MoveTransition t1 = board.currentPlayer()
                .makeMove(Move.MoveFactory.createMove(board, BoardUtils.getCoordinateAtPosition("e4"),
                        BoardUtils.getCoordinateAtPosition("f5")));

        assertEquals(MoveStatus.DONE, t1.getMoveStatus());
        assertTrue(t1.getTransitionBoard().currentPlayer().isInStaleMate());
        assertFalse(t1.getTransitionBoard().currentPlayer().isInCheck());
        assertFalse(t1.getTransitionBoard().currentPlayer().isInCheckMate());
    }

    @Test
    public void testAnonymousStaleMate() {

        final Builder builder = new Builder();
        // Black Layout
        builder.setPiece(new King(Alliance.BLACK, 2));
        // White Layout
        builder.setPiece(new Pawn(Alliance.WHITE, 10));
        builder.setPiece(new King(Alliance.WHITE, 26));
        // Set the current player
        builder.setMoveMaker(Alliance.WHITE);

        final Board board = builder.build();

        assertFalse(board.currentPlayer().isInStaleMate());

        final MoveTransition t1 = board.currentPlayer()
                .makeMove(MoveFactory.createMove(board, BoardUtils.getCoordinateAtPosition("c5"),
                        BoardUtils.getCoordinateAtPosition("c6")));

        assertEquals(MoveStatus.DONE, t1.getMoveStatus());
        assertTrue(t1.getTransitionBoard().currentPlayer().isInStaleMate());
        assertFalse(t1.getTransitionBoard().currentPlayer().isInCheck());
        assertFalse(t1.getTransitionBoard().currentPlayer().isInCheckMate());
    }

    @Test
    public void testAnonymousStaleMate2() {

        final Builder builder = new Builder();
        // Black Layout
        builder.setPiece(new King(Alliance.BLACK, 0));
        // White Layout
        builder.setPiece(new Pawn(Alliance.WHITE, 16));
        builder.setPiece(new King(Alliance.WHITE, 17));
        builder.setPiece(new Bishop(Alliance.WHITE, 19));
        // Set the current player
        builder.setMoveMaker(Alliance.WHITE);

        final Board board = builder.build();

        assertFalse(board.currentPlayer().isInStaleMate());

        final MoveTransition t1 = board.currentPlayer()
                .makeMove(MoveFactory.createMove(board, BoardUtils.getCoordinateAtPosition("a6"),
                        BoardUtils.getCoordinateAtPosition("a7")));

        assertEquals(MoveStatus.DONE, t1.getMoveStatus());
        assertTrue(t1.getTransitionBoard().currentPlayer().isInStaleMate());
        assertFalse(t1.getTransitionBoard().currentPlayer().isInCheck());
        assertFalse(t1.getTransitionBoard().currentPlayer().isInCheckMate());
    }
}