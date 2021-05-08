package Algorithmization.TwoDimentionalArrays;

public class TwoDimensionalArrays12 {
    public static int ROWS = 4;
    public static  int COLUMN = 10;

    public static void main(String[] args) {
        int[][] matrix = getMatrix(ROWS, COLUMN);
        System.out.println("\nOriginal array: ");
        display(matrix);

        System.out.println("\nSorted ascending array: ");
        display(getSortedRowsAscending(matrix));

        System.out.println("\nSorted descending array: ");
        display(getSortedRowsDescending(matrix));

    }

    private static int[][] getSortedRowsAscending(int[][] ints) {
        int rows = ints.length;
        int columns = ints[0].length;
        int temp;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < columns-1; k++) {
                    if (ints[i][j] < ints[i][k]) {
                        temp = ints[i][k];
                        ints[i][k] = ints[i][j];
                        ints[i][j] = temp;
                    }
                }
            }
        }
        return ints;
    }

    private static int[][] getSortedRowsDescending(int[][] ints) {
        int rows = ints.length;
        int columns = ints[0].length;
        int temp;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < columns-1; k++) {
                    if (ints[i][j] > ints[i][k]) {
                        temp = ints[i][k];
                        ints[i][k] = ints[i][j];
                        ints[i][j] = temp;
                    }
                }
            }
        }
        return ints;
    }

    private static void display(int[][] ints) {
        int row = ints.length;
        int column = ints[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix(int line, int column) {
        int[][] ints = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                ints[i][j] = (int) (Math.random() * 10);
            }
        }
        return ints;
    }
}
