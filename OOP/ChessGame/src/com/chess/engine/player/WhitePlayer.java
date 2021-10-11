/**
 * Created by abuzer.alaca on 08/10/2021
 **/


package com.chess.engine.player;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import com.chess.engine.board.Move.*;
import com.chess.engine.board.Tile;
import com.chess.engine.pieces.Piece;
import com.chess.engine.pieces.Rook;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class WhitePlayer extends Player {
    public WhitePlayer(final Board board,
                       final Collection<Move> whiteStandardLegalMoves,
                       final Collection<Move> blackStandardLegalMoves) {
        super(board, whiteStandardLegalMoves, blackStandardLegalMoves);

    }

    @Override
    public Collection<Piece> getActievePieces() {
        return this.board.getWhitePieces();
    }

    @Override
    public Alliance getAlliance() {
        return Alliance.WHITE;
    }

    @Override
    public Player getOpponent() {
        return this.board.blackPlayer();
    }

    @Override
    protected Collection<Move> calculateKingCastles(Collection<Move> playerLegalMoves, Collection<Move> opponentsLegalMoves) {
        final List<Move> kingCastles = new ArrayList<>();
        if (this.playerKing.isFirstMove() && !this.isInCheck()) {
            // white kingSideCastle
            if (!this.board.getTile(61).isTileOccupied() && !this.board.getTile(62).isTileOccupied()) {
                final Tile rookTile = this.board.getTile(63);
                // TODO: Duplicate code cleaning
//                check(opponentsLegalMoves, kingCastle, rookTile, new ArrayList<>(Arrays.asList(61, 62)));
                if (rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove() &&
                        Player.calculateAttacksOnTile(61, opponentsLegalMoves).isEmpty() &&
                        Player.calculateAttacksOnTile(62, opponentsLegalMoves).isEmpty() &&
                        rookTile.getPiece().getPieceType().isRook()) {
                    kingCastles.add(new Move.KingSideCastle(this.board, this.playerKing, 62,
                            (Rook) rookTile.getPiece(), rookTile.getTileCoordinate(), 61));
                }
            }
            // white queenSideCastle
            if (!this.board.getTile(59).isTileOccupied() &&
                    !this.board.getTile(58).isTileOccupied() &&
                    !this.board.getTile(57).isTileOccupied()) {
                final Tile rookTile = this.board.getTile(56);
                // TODO: Duplicate code cleaning
//                check(opponentsLegalMoves, kingCastle, rookTile, new ArrayList<>(Arrays.asList(57, 58, 59));
                if (rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove() && Player.calculateAttacksOnTile(57, opponentsLegalMoves).isEmpty() &&
                        Player.calculateAttacksOnTile(58, opponentsLegalMoves).isEmpty() &&
                        Player.calculateAttacksOnTile(59, opponentsLegalMoves).isEmpty() &&
                        rookTile.getPiece().getPieceType().isRook()) {
                    kingCastles.add(new Move.KingSideCastle(this.board, this.playerKing, 58,
                            (Rook) rookTile.getPiece(), rookTile.getTileCoordinate(), 59));
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
