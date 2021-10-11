/**
 * Created by abuzer.alaca on 08/10/2021
 **/

package com.chess.engine.board;

public class BoardUtils {
    public static final boolean[] FIRST_COLUMN = initColumn(0);
    public static final boolean[] SECOND_COLUMN = initColumn(1);
    // public static final boolean[] THIRD_COLUMN = initColumn(2);
    // public static final boolean[] FOURTH_COLUMN = initColumn(3);
    // public static final boolean[] FIFTH_COLUMN = initColumn(4);
    // public static final boolean[] SIXTH_COLUMN = initColumn(5);
    public static final boolean[] SEVENTH_COLUMN = initColumn(6);
    public static final boolean[] EIGHTH_COLUMN = initColumn(7);

    public static final boolean[] EIGHTH_RANK = initRow(0);
    public static final boolean[] SEVENTH_RANK = initRow(8);
    public static final boolean[] SIXTH_RANK = initRow(16);
    public static final boolean[] FIFTH_RANK = initRow(24);
    public static final boolean[] FOURTH_RANK = initRow(32);
    public static final boolean[] THIRD_RANK = initRow(40);
    public static final boolean[] SECOND_RANK = initRow(48);
    public static final boolean[] FIRST_RANK = initRow(56);

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

    private static boolean[] initRow(int rowNumber) {
        final boolean[] row = new boolean[64];
        do {
            row[rowNumber] = true;
            rowNumber++;
        } while (rowNumber % NUM_TILES_PER_ROW != 0);

        return row;
    }


    public static boolean isValidTileCoordinate(int coordinate) {
        return coordinate >= 0 && coordinate < NUM_TILES;
    }

}
