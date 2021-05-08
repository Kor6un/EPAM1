package Algorithmization.TwoDimentionalArrays;

public class TwoDimensionalArrays13 {
    public static int ROWS = 4;
    public static  int COLUMN = 10;

    public static void main(String[] args) {
        int[][] matrix = getMatrix(ROWS, COLUMN);
        System.out.println("\nOriginal array: ");
        display(matrix);

        System.out.println("\nSorted ascending array: ");
        display(getSortedColumnsAscending(matrix));

        System.out.println("\nSorted descending array: ");
        display(getSortedColumnsDescending(matrix));

    }

    private static int[][] getSortedColumnsAscending(int[][] ints) {
        int rows = ints.length;
        int columns = ints[0].length;
        int temp;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < rows-1; k++) {
                    if (ints[j][i] < ints[k][i]) {
                        temp = ints[j][i];
                        ints[j][i] = ints[k][i];
                        ints[k][i] = temp;
                    }
                }
            }
        }
        return ints;
    }

    private static int[][] getSortedColumnsDescending(int[][] ints) {
        int rows = ints.length;
        int columns = ints[0].length;
        int temp;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < rows-1; k++) {
                    if (ints[j][i] > ints[k][i]) {
                        temp = ints[j][i];
                        ints[j][i] = ints[k][i];
                        ints[k][i] = temp;
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
