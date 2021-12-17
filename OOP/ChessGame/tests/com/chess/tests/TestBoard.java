package com.chess.tests;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.BoardUtils;
import com.chess.engine.board.Move;
import com.chess.engine.board.Move.*;
import com.chess.engine.board.Tile;
import com.chess.engine.pieces.*;
import com.chess.engine.player.*;
import com.chess.engine.player.ai.MiniMax;
import com.chess.engine.player.ai.MoveStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBoard {

    @Test
    public void initialBoard() {
        final Board board = Board.createStandardBoard();
        assertEquals(board.whitePlayer().getLegalMoves().size(), 20);
        assertEquals(board.blackPlayer().getLegalMoves().size(), 20);
        assertFalse(board.currentPlayer().isInCheck());
        assertFalse(board.currentPlayer().isInCheckMate());
        assertFalse(board.currentPlayer().getOpponent().isInCheck());
        assertFalse(board.currentPlayer().getOpponent().isInCheckMate());
        assertEquals(board.currentPlayer(), board.whitePlayer());
        assertEquals(board.currentPlayer().getOpponent(), board.blackPlayer());
//        assertEquals(new SimpleBoardEvaluator().evaluate(board, 0), 0);
    }

    @Test
    public void testFoolsMate() {
        final Board board = Board.createStandardBoard();
        final MoveTransition t1 = board.currentPlayer().makeMove(Move.MoveFactory.createMove(board,
                BoardUtils.getCoordinateAtPosition("f2"),
                BoardUtils.getCoordinateAtPosition("f3")));
        System.out.println(t1.getTransitionBoard());
        assertTrue(t1.getMoveStatus().isDone());

        final MoveTransition t2 = t1.getTransitionBoard().currentPlayer()
                .makeMove(Move.MoveFactory.createMove(board,
                        BoardUtils.getCoordinateAtPosition("e7"),
                        BoardUtils.getCoordinateAtPosition("e5")));
        System.out.println(t2.getTransitionBoard());
        assertTrue(t2.getMoveStatus().isDone());

        final MoveTransition t3 = t2.getTransitionBoard().currentPlayer()
                .makeMove(Move.MoveFactory.createMove(board,
                        BoardUtils.getCoordinateAtPosition("g2"),
                        BoardUtils.getCoordinateAtPosition("g4")));
        System.out.println(t3.getTransitionBoard());
        assertTrue(t3.getMoveStatus().isDone());

        final MoveStrategy strategy = new MiniMax(4);
        final Move aiMove = strategy.execute(t3.getTransitionBoard());
        final Move bestMove = Move.MoveFactory.createMove(t3.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("d8"), BoardUtils.getCoordinateAtPosition("h4"));

        assertEquals(aiMove, bestMove);

    }

    @Test
    public void testPlainKingMove() {

        final Board.Builder builder = new Board.Builder();
        // Black Layout
        builder.setPiece(new King(Alliance.BLACK, 4));
        builder.setPiece(new Pawn(Alliance.BLACK, 12));
        // White Layout
        builder.setPiece(new Pawn(Alliance.WHITE, 52));
        builder.setPiece(new King(Alliance.WHITE, 60));
        builder.setMoveMaker(Alliance.WHITE);
        // Set the current player
        final Board board = builder.build();

        assertEquals(board.whitePlayer().getLegalMoves().size(), 6);
        assertEquals(board.blackPlayer().getLegalMoves().size(), 6);
        assertFalse(board.currentPlayer().isInCheck());
        assertFalse(board.currentPlayer().isInCheckMate());
        assertFalse(board.currentPlayer().getOpponent().isInCheck());
        assertFalse(board.currentPlayer().getOpponent().isInCheckMate());
        assertEquals(board.currentPlayer(), board.whitePlayer());
        assertEquals(board.currentPlayer().getOpponent(), board.blackPlayer());
//        assertEquals(new SimpleBoardEvaluator().evaluate(board, 0), 0);

        final MoveTransition moveTransition = board.currentPlayer()
                .makeMove(MoveFactory.createMove(board, BoardUtils.getCoordinateAtPosition("e1"),
                        BoardUtils.getCoordinateAtPosition("f1")));

        assertEquals(MoveStatus.DONE, moveTransition.getMoveStatus());
        assertEquals(moveTransition.getTransitionBoard().whitePlayer().getPlayerKing().getPiecePosition(), 61);
    }

    @Test
    public void testBoardConsistency() {
        final Board board = Board.createStandardBoard();
        assertEquals(board.currentPlayer(), board.whitePlayer());

        final MoveTransition t1 = board.currentPlayer()
                .makeMove(Move.MoveFactory.createMove(board, BoardUtils.getCoordinateAtPosition("e2"),
                        BoardUtils.getCoordinateAtPosition("e4")));
        final MoveTransition t2 = t1.getTransitionBoard()
                .currentPlayer()
                .makeMove(Move.MoveFactory.createMove(t1.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("e7"),
                        BoardUtils.getCoordinateAtPosition("e5")));

        final MoveTransition t3 = t2.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t2.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("g1"),
                        BoardUtils.getCoordinateAtPosition("f3")));
        final MoveTransition t4 = t3.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t3.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("d7"),
                        BoardUtils.getCoordinateAtPosition("d5")));

        final MoveTransition t5 = t4.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t4.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("e4"),
                        BoardUtils.getCoordinateAtPosition("d5")));
        final MoveTransition t6 = t5.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t5.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("d8"),
                        BoardUtils.getCoordinateAtPosition("d5")));

        final MoveTransition t7 = t6.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t6.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("f3"),
                        BoardUtils.getCoordinateAtPosition("g5")));
        final MoveTransition t8 = t7.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t7.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("f7"),
                        BoardUtils.getCoordinateAtPosition("f6")));

        final MoveTransition t9 = t8.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t8.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("d1"),
                        BoardUtils.getCoordinateAtPosition("h5")));
        final MoveTransition t10 = t9.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t9.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("g7"),
                        BoardUtils.getCoordinateAtPosition("g6")));

        final MoveTransition t11 = t10.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t10.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("h5"),
                        BoardUtils.getCoordinateAtPosition("h4")));
        final MoveTransition t12 = t11.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t11.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("f6"),
                        BoardUtils.getCoordinateAtPosition("g5")));

        final MoveTransition t13 = t12.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t12.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("h4"),
                        BoardUtils.getCoordinateAtPosition("g5")));
        final MoveTransition t14 = t13.getTransitionBoard()
                .currentPlayer()
                .makeMove(MoveFactory.createMove(t13.getTransitionBoard(), BoardUtils.getCoordinateAtPosition("d5"),
                        BoardUtils.getCoordinateAtPosition("e4")));

//        assertTrue(t14.getTransitionBoard().whitePlayer().getActivePieces().size() == calculatedActivesFor(t14.getTransitionBoard(), Alliance.WHITE));
//        assertTrue(t14.getTransitionBoard().blackPlayer().getActivePieces().size() == calculatedActivesFor(t14.getTransitionBoard(), Alliance.BLACK));

    }

//    private static int calculatedActivesFor(final Board board,
//                                            final Alliance alliance) {
//        int count = 0;
//        for (final Tile t : board.getGameBoard()) {
//            if (t.isTileOccupied() && t.getPiece().getPieceAllegiance() == alliance) {
//                count++;
//            }
//        }
//        return count;
//    }

}