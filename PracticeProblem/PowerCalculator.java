import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        double base = scanner.nextDouble();

        
        double exponent = scanner.nextDouble();

        
        double result = Math.pow(base, exponent);

       
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
