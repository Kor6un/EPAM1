package BasicOfSoftwareCodeDevelopment.LinearPrograms;

/*

Дано действительное число R вида nnn.ddd (три цифровые разряда в целой и дробной частях).
Поменять местами дробную и целую часть и вывести полученное значение числа.

*/

import java.util.Scanner;

public class LinearPrograms4 {
    public static void main(String[] args) {

        double r;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действительное число R вида nnn.ddd " +
                "\n(три цифровые разряда в целой и дробной частях): ");

        r = scanner.nextDouble();
        scanner.close();

        String[] res = Double.toString(r).split("\\.");

        System.out.println(Double.parseDouble(res[1] + "." + res[0]));

    }
}
