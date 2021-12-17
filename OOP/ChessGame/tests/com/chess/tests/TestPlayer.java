package com.chess.tests;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Board.*;
import com.chess.engine.board.BoardUtils;
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
//import com.chess.engine.classic.pieces.Rook;
//import com.chess.engine.classic.player.ai.SimpleBoardEvaluator;

public class TestPlayer {

    @Test
    public void testSimpleEvaluation() {

        final Board board = Board.createStandardBoard();

        final MoveTransition t1 = board.currentPlayer()
                .makeMove(MoveFactory.createMove(board, BoardUtils.getCoordinateAtPosition("e2"),
                        BoardUtils.getCoordinateAtPosition("e4")));

        assertEquals(MoveStatus.DONE, t1.getMoveStatus());

        final MoveTransition t2 = t1.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t1.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("e7"),
                        BoardUtils.getCoordinateAtPosition("e5")));

        assertEquals(MoveStatus.DONE, t2.getMoveStatus());

//        assertEquals(new SimpleBoardEvaluator().evaluate(t2.getTransitionBoard(), 0), 0);
    }

    @Test
    public void testBug() {

        final Board board = Board.createStandardBoard();

        final MoveTransition t1 = board.currentPlayer()
                .makeMove(MoveFactory.createMove(board, BoardUtils.getCoordinateAtPosition("c2"),
                        BoardUtils.getCoordinateAtPosition("c3")));

        assertEquals(MoveStatus.DONE, t1.getMoveStatus());

        final MoveTransition t2 = t1.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t1.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("b8"),
                        BoardUtils.getCoordinateAtPosition("a6")));

        assertEquals(MoveStatus.DONE, t2.getMoveStatus());

        final MoveTransition t3 = t2.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t2.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("d1"),
                        BoardUtils.getCoordinateAtPosition("a4")));

        assertEquals(MoveStatus.DONE, t3.getMoveStatus());

        final MoveTransition t4 = t3.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t3.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("d7"),
                        BoardUtils.getCoordinateAtPosition("d6")));

        assertEquals(MoveStatus.LEAVES_PLAYER_IN_CHECK, t4.getMoveStatus());

    }

    @Test
    public void testDiscoveredCheck() {

        final Builder builder = new Builder();

        // Black Layout
        builder.setPiece(new King(Alliance.BLACK, 4));
        builder.setPiece(new Rook(Alliance.BLACK, 24));
        // White Layout
        builder.setPiece(new Bishop(Alliance.WHITE, 44));
        builder.setPiece(new Rook(Alliance.WHITE, 52));
        builder.setPiece(new King(Alliance.WHITE, 58));
        // Set the current player
        builder.setMoveMaker(Alliance.WHITE);

        final Board board = builder.build();

        final MoveTransition t1 = board.currentPlayer()
                .makeMove(MoveFactory.createMove(board, BoardUtils.getCoordinateAtPosition("e3"),
                        BoardUtils.getCoordinateAtPosition("b6")));

        assertEquals(MoveStatus.DONE, t1.getMoveStatus());
        assertTrue(t1.getTransitionBoard().currentPlayer().isInCheck());

        final MoveTransition t2 = t1.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t1.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("a5"),
                        BoardUtils.getCoordinateAtPosition("b5")));

        assertEquals(MoveStatus.LEAVES_PLAYER_IN_CHECK, t2.getMoveStatus());

        final MoveTransition t3 = t1.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t1.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("a5"),
                        BoardUtils.getCoordinateAtPosition("e5")));

        assertEquals(MoveStatus.DONE, t3.getMoveStatus());
    }

}
