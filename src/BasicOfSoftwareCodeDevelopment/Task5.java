package BasicOfSoftwareCodeDevelopment;

/*

Дано натуральное число Т, которое представляет собой длительность прошедшего
времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
HHч MMмин SSс.

*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int t, h, m, s;

        System.out.println("Enter the number of seconds T:");
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        scanner.close();

        h = t/3600;
        m = (t - h*3600)/60;
        s = t%60;

        StringBuilder result = getFormattingResult(h);
        result.append("ч ")
                .append(getFormattingResult(m)).append("мин ")
                .append(getFormattingResult(s).append("c"));

        System.out.println(result);
    }

    private static StringBuilder getFormattingResult(int h) {
        StringBuilder result = new StringBuilder();
        if (h <= 9 ) {
            result.append(0).append(h);
        } else {
            result.append(h);
        }
        return result;
    }
}
