package Algorithmization.TwoDimentionalArrays;

public class TwoDimensionalArrays11 {
    public static int ROWS = 10;
    public static  int COLUMNS = 20;

    public static void main(String[] args) {
        int[][] matrix = getMatrix(ROWS, COLUMNS);
        display(matrix);

        getSolution(matrix);
    }

    private static void getSolution(int[][] ints) {
        int row = ints.length;
        int column = ints[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (ints[i][j] == 5) {
                    count += 1;
                }
            }
            if (count >= 3) {
                System.out.println(i+1);
            }
            count = 0;
        }
    }

    private static void display(int[][] ints) {
        int rows = ints.length;
        int columns = ints[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (ints[i][j] > 9) {
                    System.out.print(ints[i][j] + "  ");
                } else {
                    System.out.print(ints[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix(int line, int column) {
        int[][] ints = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                ints[i][j] = (int) (Math.random() * 15);
            }
        }
        return ints;
    }
}
