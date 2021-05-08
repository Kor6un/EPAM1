package BasicOfSoftwareCodeDevelopment.Loops;

public class Loop4 {
    public static void main(String[] args) {
        long result = 1;
        for (int i = 1; i <= 200; i++) {
            result = (long) (result*Math.pow(i, 2));
        }
        System.out.println(result);
    }
}
