package BasicOfSoftwareCodeDevelopment.Loops;

public class Loop3 {
    public static void main(String[] args) {

        int result = 0;

        for (int i = 1; i <= 100; i++ ) {
            result += Math.pow(i, 2);
        }

        System.out.println("The sum of the first hundred numbers = " + result);
    }
}
