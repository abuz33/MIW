package com.chess.tests;

import static junit.framework.Assert.assertEquals;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Board.*;
import com.chess.engine.pieces.*;
import org.junit.Test;

//import com.chess.engine.classic.Alliance;
//import com.chess.engine.classic.board.Board;
//import com.chess.engine.classic.board.Board.Builder;
//import com.chess.engine.classic.pieces.King;
//import com.chess.engine.classic.pieces.Pawn;
//import com.chess.engine.classic.player.ai.PawnStructureAnalyzer;

public class TestPawnStructure {

    @Test
    public void test1() {
        final Board.Builder builder = new Builder();
        // Black Layout
        builder.setPiece(new King(Alliance.BLACK, 4));
        builder.setPiece(new Pawn(Alliance.BLACK, 12));
        builder.setPiece(new Pawn(Alliance.BLACK, 20));
        builder.setPiece(new Pawn(Alliance.BLACK, 28));
        builder.setPiece(new Pawn(Alliance.BLACK, 8));
        builder.setPiece(new Pawn(Alliance.BLACK, 16));
        // White Layout
        builder.setPiece(new Pawn(Alliance.WHITE, 52));
        builder.setPiece(new King(Alliance.WHITE, 60));
        builder.setMoveMaker(Alliance.WHITE);
        // Set the current player
        final Board board = builder.build();

//        assertEquals(PawnStructureAnalyzer.get().pawnStructureScore(board.whitePlayer()), -25);
//        assertEquals(PawnStructureAnalyzer.get().pawnStructureScore(board.blackPlayer()), -100);
    }

}