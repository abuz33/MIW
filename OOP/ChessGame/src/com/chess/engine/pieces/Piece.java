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
    protected final PieceType pieceType;

    public Piece(final PieceType pieceType,
                 final Alliance pieceAlliance, final int piecePosition) {
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
        this.pieceType = pieceType;
        // TODO: More work here too!!!
        this.isFirstMove = false;
    }

    public PieceType getPieceType() {
        return pieceType;
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

    public enum PieceType {
        BISHOP("B") {
            @Override
            public boolean isKing() {
                return false;
            }
        },
        KING("K") {
            @Override
            public boolean isKing() {
                return true;
            }
        },
        KNIGHT("N") {
            @Override
            public boolean isKing() {
                return false;
            }
        },
        PAWN("P") {
            @Override
            public boolean isKing() {
                return false;
            }
        },
        QUEEN("Q") {
            @Override
            public boolean isKing() {
                return false;
            }
        },
        ROOK("R") {
            @Override
            public boolean isKing() {
                return false;
            }
        };


        private String pieceName;

        PieceType(final String pieceName) {
            this.pieceName = pieceName;
        }

        @Override
        public String toString() {
            return pieceName;
        }

        public abstract boolean isKing();
    }
}
