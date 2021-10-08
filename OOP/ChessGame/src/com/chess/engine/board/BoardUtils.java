/**
 * Created by abuzer.alaca on 08/10/2021
 **/

package com.chess.engine.board;

public class BoardUtils {
    public static final boolean[] FIRST_COLUMN = initColumn(0);
    public static final boolean[] SECOND_COLUMN = initColumn(1);
    public static final boolean[] SEVENTH_COLUMN = initColumn(6);
    public static final boolean[] EIGHTH_COLUMN = initColumn(7);


    public static final boolean[] SECOND_ROW = initRow(1);
    public static final boolean[] SEVENTH_ROW = initRow(6);

    public static final int NUM_TILES = 64;
    public static final int NUM_TILES_PER_ROW = 8;

    private BoardUtils() {
        throw new RuntimeException("Don't try to instantiate me (You moron :DD )!!!!");
    }

    private static boolean[] initColumn(int columnNumber) {
        final boolean[] col = new boolean[64];
        do {
            col[columnNumber] = true;
            columnNumber += NUM_TILES_PER_ROW;
        } while (columnNumber < NUM_TILES);

        return col;
    }

    private static boolean[] initRow(int columnNumber) {
        final boolean[] col = new boolean[64];
        do {
            col[columnNumber] = true;
            columnNumber += NUM_TILES_PER_ROW;
        } while (columnNumber < NUM_TILES);

        return col;
    }


    public static boolean isValidTileCoordinate(int coordinate) {
        return coordinate >= 0 && coordinate < NUM_TILES;
    }

}
