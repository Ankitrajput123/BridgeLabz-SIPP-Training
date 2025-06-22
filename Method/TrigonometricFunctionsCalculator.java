import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

        public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double radians = Math.toRadians(angleInDegrees); 

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

                double[] results = calculateTrigonometricFunctions(angle);

        
        System.out.printf("Sine(%.2f°)   = %.4f%n", angle, results[0]);
        System.out.printf("Cosine(%.2f°) = %.4f%n", angle, results[1]);
        System.out.printf("Tangent(%.2f°)= %.4f%n", angle, results[2]);

        scanner.close();
    }
}
