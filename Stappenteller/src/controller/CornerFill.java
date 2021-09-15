package controller;

public class CornerFill {
    public static void main(String[] args) {
//        int[] ans1 = cornerFill(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
//        int[] ans2 = cornerFill(new int[][]{{1, 2}, {4, 5}});
//        int[] ans3 = cornerFill(new int[][]{{1}});
        int[] ans4 = cornerFill(new int[][]{{1, 2, 3, 12}, {4, 5, 6, 11}, {7, 8, 9, 4}, {7, 8, 9, 4}});
//        print(ans1);
//        print(ans2);
//        print(ans3);
//        print(ans4);

    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] cornerFill(int[][] square) {
        int l = square.length;
        int[] nums = new int[(int) Math.pow(l, 2)];
        int[][] places = new int[(l - 1) * (l - 1)][2];
        int i = 0;
        int j = 0;
        int pos = 0;
        String operation = "plus";

        // [0,0],[0,1],[0,2]
        // [1,0],[1,1],[1,2]
        // [2,0],[2,1],[2,2]

        // [0,0],[0,1],[0,2],J++
        // [1,2],[2,2], i++
        // [2,1],[1,1], i--
        // [1,0], j--
        // [2,0] i+

        // [0,0],[0,1],[0,2],[0,3]
        // [1,0],[1,1],[1,2],[1,3]
        // [2,0],[2,1],[2,2],[2,3]
        // [3,0],[3,1],[3,2],[3,3]
        //  i,j
        // [0,0],[0,1],[0,2],[0,3], j++

        // [1,3],[2,3],[3,3], i++ (j--)
        // [3,2],[2,2],[1,2], i--

        // [1,1],[1,0], j-- (i++)
        // [2,0],[2,1], j++

        // [3,1], i++
        // [3,0], j--

        while (pos < (l-1)*(l-1)) {
            if (j < l - 1) {
                j = doOperation(j, operation);
            } else if (i < l - 1) {
                i = doOperation(i, operation);
            }
            places[pos][0] = i;
            places[pos][1] = j;
            pos++;
        }
        for (int k = 0; k < places.length; k++) {
            System.out.print(places[k][0] + " " + places[k][1] + "\n");
        }
        return nums;
    }

    public static int doOperation(int i, String operation) {
        if (operation == "plus") return i + 1;
        else return i - 1;
    }
}
