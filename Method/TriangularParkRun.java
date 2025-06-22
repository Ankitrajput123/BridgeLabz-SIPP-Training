import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate number of rounds required to complete 5km (5000 meters)
    public static double calculateRounds(double perimeter, double totalDistance) {
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter side 1 of the triangular park in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangular park in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangular park in meters: ");
        double side3 = scanner.nextDouble();

                if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            double perimeter = calculatePerimeter(side1, side2, side3);
            double rounds = calculateRounds(perimeter, 5000); // 5 km = 5000 meters

            System.out.printf("The athlete must complete %.2f rounds to run 5 kilometers.%n", rounds);
        } else {
            System.out.println("Invalid triangle sides. Please enter valid side lengths.");
        }

        scanner.close();
    }
}
