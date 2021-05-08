package Algorithmization.Decomposition;

import java.util.Scanner;

public class Decomposition4 {
    public static void main(String[] args) {

        int n;

        System.out.print("Enter the count points n: ");
        n = getInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = getRandomInt();
            y[i] = getRandomInt();
        }

        displayPoints(x, y);

        maxDistance(x, y);
    }

    private static void maxDistance(int[] x, int[] y) {
        int index1 = 0, index2 = 0;
        double max = getDistance(x[0], y[0], x[1], y[1]);
        for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < y.length; j++) {
                if (i < j && max < getDistance(x[i], y[i], x[j], y[j])) {
                    max = getDistance(x[i], y[i], x[j], y[j]);
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("Max distance between Point " + (index1 + 1) +
                " and Point " + (index2 + 1) + " = " + max);
    }

    private static void displayPoints(int[] x, int[] y) {
        if (x.length == y.length) {
            for (int i = 0; i < x.length; i++) {
                System.out.println("Point " + (i + 1) + " (" + x[i] + ", " + y[i] + ")");
            }
        } else {
            System.out.println("Error count of coordinates!");
        }
    }

    private static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));
    }

    private static int getInt() {
        return  new Scanner(System.in).nextInt();
    }

    //рандомит числа от -10 до 10 (исключая границы диапазона)
    private static int getRandomInt() {
        return (int) (Math.random() * 20 - 10);
    }
}
