/**
 * Created by abuzer.alaca on 08/10/2021
 **/


package com.chess.engine.player;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import com.chess.engine.board.Tile;
import com.chess.engine.pieces.Piece;
import com.chess.engine.pieces.Rook;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BlackPlayer extends Player {
    public BlackPlayer(final Board board,
                       final Collection<Move> whiteStandardLegalMoves,
                       final Collection<Move> blackStandardLegalMoves) {
        super(board, blackStandardLegalMoves, whiteStandardLegalMoves);
    }

    @Override
    public Collection<Piece> getActievePieces() {
        return this.board.getBlackPieces();
    }

    @Override
    public Alliance getAlliance() {
        return Alliance.BLACK;
    }

    @Override
    public Player getOpponent() {
        return this.board.whitePlayer();
    }

    protected Collection<Move> calculateKingCastles(final Collection<Move> playerLegalMoves,
                                                    final Collection<Move> opponentsLegalMoves) {
        final List<Move> kingCastles = new ArrayList<>();
        if (this.playerKing.isFirstMove() && !this.isInCheck()) {
            // black kingSideCastle
            if (!this.board.getTile(5).isTileOccupied() && !this.board.getTile(5).isTileOccupied()) {
                final Tile rookTile = this.board.getTile(7);
//                check(opponentsLegalMoves, kingCastle, rookTile, new ArrayList<>(Arrays.asList(61, 62)));
                if (rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove() &&
                        Player.calculateAttacksOnTile(5, opponentsLegalMoves).isEmpty() &&
                        Player.calculateAttacksOnTile(6, opponentsLegalMoves).isEmpty() &&
                        rookTile.getPiece().getPieceType().isRook()) {
                    // TODO Add a Castle Move
                    kingCastles.add(new Move.KingSideCastle(this.board, this.playerKing, 6,
                            (Rook) rookTile.getPiece(), rookTile.getTileCoordinate(), 5));
                }
            }
            // black queenSideCastle
            if (!this.board.getTile(1).isTileOccupied() &&
                    !this.board.getTile(2).isTileOccupied() &&
                    !this.board.getTile(3).isTileOccupied()) {
                final Tile rookTile = this.board.getTile(0);
//                check(opponentsLegalMoves, kingCastle, rookTile, new ArrayList<>(Arrays.asList(57, 58, 59));
                if (rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove() &&
                        Player.calculateAttacksOnTile(1, opponentsLegalMoves).isEmpty() &&
                        Player.calculateAttacksOnTile(2, opponentsLegalMoves).isEmpty() &&
                        Player.calculateAttacksOnTile(3, opponentsLegalMoves).isEmpty() &&
                        rookTile.getPiece().getPieceType().isRook()) {
                    // TODO Add a Castle Move!!!;

                    //  kingCastles.add(null);
                    kingCastles.add(new Move.KingSideCastle(this.board, this.playerKing, 2,
                            (Rook) rookTile.getPiece(), rookTile.getTileCoordinate(), 3));

                }

            }
        }

        return ImmutableList.copyOf(kingCastles);
    }

    // TODO: Duplicate code cleaning
    private void check(final Collection<Move> opponentsLegalMoves,
                       final List<Move> kingCastle,
                       final Tile rookTile,
                       final ArrayList<Integer> checkTileNumbers) {
        boolean check = true;
        for (final int tileNumber : checkTileNumbers) {
            if (Player.calculateAttacksOnTile(tileNumber, opponentsLegalMoves).isEmpty()) {
                check = true;
            } else {
                check = false;
                break;
            }
        }

        if (rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove()) {
            if (check &&
                    rookTile.getPiece().getPieceType().isRook()) {
                kingCastle.add(null);
            }
        }
    }
}
