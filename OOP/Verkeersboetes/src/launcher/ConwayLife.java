package launcher;

public class ConwayLife {
    public static void main(String[] args) {
        int[][] glider = new int[][]{{1, 1, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 1, 1, 1}};

        int[][] res = getGeneration(glider, 5);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " - ");
            }
            System.out.println();
        }
    }

    public static int[][] getGeneration(int[][] cells, int generations) {
        if (generations < 1) {
            return cropped(cells);
        }
        // your code goes here
        int[][] neghLiveCount = new int[cells.length + 2][cells[0].length + 2];
        int[][] newCells = new int[cells.length + 2][cells[0].length + 2];
        for (int i = 0; i < cells.length; i++) {
            System.arraycopy(cells[i], 0, newCells[i + 1], 1, cells[0].length);
        }
        int numLiveCell = 0;
        for (int i = 0; i < newCells.length; i++) {
            for (int j = 0; j < newCells[0].length; j++) {
                numLiveCell = 0;
                for (Direction dir : Direction.values()) {
                    if ((i + dir.dx) < 0 || (j + dir.dy) < 0 || (i + dir.dx) >= cells.length || (j + dir.dy) >= newCells[i].length) {
                        continue;
                    }
                    numLiveCell += newCells[i + dir.dx][j + dir.dy] == 1 ? 1 : 0;
                    if (numLiveCell >= 4) break;
                }
                neghLiveCount[i][j] = numLiveCell;
            }
        }


        for (int i = 0; i < newCells.length; i++) {
            for (int j = 0; j < newCells[0].length; j++) {
                if (newCells[i][j] == 1) {
                    if (neghLiveCount[i][j] < 2 || neghLiveCount[i][j] > 3) newCells[i][j] = 0;
                    else newCells[i][j] = 1;
                } else {
                    if (neghLiveCount[i][j] == 3) {
                        newCells[i][j] = 1;
                    }
                }
            }
        }

        for (int[] neg : newCells) {
            for (int j = 0; j < newCells[0].length; j++) {
                System.out.print(neg[j] + " - ");
            }
            System.out.println();
        }


        newCells = cropped(newCells);

        return getGeneration(newCells, generations - 1);
    }

    public enum Direction {
        NORTHWEST(-1, -1),
        NORTH(0, -1),
        NORTHEAST(1, -1),
        EAST(1, 0),
        SOUTHEAST(1, 1),
        SOUTH(0, 1),
        SOUTHWEST(-1, 1),
        WEST(-1, 0);

        public final int dx;
        public final int dy;

        Direction(int dx, int dy) {
            this.dx = dx;
            this.dy = dy;
        }
    }


    public static int[][] cropped(int[][] cells) {
    /*  In a grid with (0,0) as top left:
        leftmost: x val closest to 0
        rightmost: x val furthest from 0
        uppermost: y val closest to 0
        lowermost: y val furthest from 0  */

        int leftmost = cells[0].length, rightmost = 0, uppermost = cells.length, lowermost = 0;
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j] == 1) {
                    if (i < uppermost)
                        uppermost = i;
                    if (i > lowermost)
                        lowermost = i;
                    if (j < leftmost)
                        leftmost = j;
                    if (j > rightmost)
                        rightmost = j;
                }
            }
        }
        System.out.printf("leftmost = %s, rightmost = %s, uppermost = %s, lowermost = %s\n", leftmost, rightmost, uppermost, lowermost);
        System.out.printf("size [%s][%s]\n", cells.length, cells[0].length);

        int[][] cropped = new int[lowermost - uppermost + 1][rightmost - leftmost + 1];
        for (int i = uppermost; i <= lowermost; i++)
            for (int j = leftmost; j <= rightmost; j++)
                cropped[i - uppermost][j - leftmost] = cells[i][j];
        return cropped;
    }
}

