/**
 * Created by abuzer.alaca on 08/10/2021
 **/


package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public class Move {
    final Board board;
    final Piece piece;
    final int destinationCoordinate;

    public Move(Board board, Piece piece, int destinationCoordinate) {
        this.board = board;
        this.piece = piece;
        this.destinationCoordinate = destinationCoordinate;
    }

    public int getDestinationCoordinate() {
        return this.destinationCoordinate;
    }

    public static final class MajorMove extends Move {
        public MajorMove(final Board board,
                         final Piece piece,
                         final int destinationCoordinate) {
            super(board, piece, destinationCoordinate);
        }
    }

    public static final class AttackMove extends Move {
        final Piece attackedPiece;

        public AttackMove(final Board board,
                          final Piece piece,
                          final int destinationCoordinate,
                          final Piece attackedPiece) {
            super(board, piece, destinationCoordinate);
            this.attackedPiece = attackedPiece;
        }
    }
}
