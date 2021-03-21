package BasicOfSoftwareCodeDevelopment;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {

        float a, b, h;

        System.out.println("Enter segment coordinates (a, b): ");

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();

        System.out.println("Enter increment h: ");
        h = scanner.nextFloat();
        scanner.close();

       do {
           if (a > b) {
               System.out.println("Incorrect input! You must enter a < b!");
               break;
           } else {
               if (a > 2) {
                   System.out.println(a);
               } else {
                   System.out.println(-a);
               }
               a = a + h;
           }
       } while (a <= b);
    }
}
