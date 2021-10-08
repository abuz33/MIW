package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

import java.util.Collection;
import java.util.List;

public abstract class Piece {
    protected final int piecePosition;
    protected final Alliance pieceAlliance;
    protected final boolean isFirstMove;

    public Piece(final Alliance pieceAlliance, final int piecePosition) {
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
        // TODO: More work here too!!!
        this.isFirstMove = false;
    }

    public Alliance getPieceAlliance() {
        return pieceAlliance;
    }

    public boolean isFirstMove() {
        return this.isFirstMove;
    }

    public int getPiecePosition() {
        return piecePosition;
    }

    public abstract Collection<Move> calculateLegalMoves(final Board board);
}
