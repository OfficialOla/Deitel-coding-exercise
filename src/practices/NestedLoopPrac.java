package practices;

public class NestedLoopPrac {
    public static void main(String[] args) {
        int[][] numberGrid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        for (int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j <numberGrid[i].length ; j++) {
                System.out.print(numberGrid[i][j]);

            }
            System.out.println();

        }
        for (int[] ints : numberGrid) {
            for (int numberGrids : ints) {
                System.out.print(numberGrids);

            }
            System.out.println();
        }
    }
}
