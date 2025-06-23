import java.util.Scanner;

public class FactorialCalculator {

    
    public static int getInput(Scanner scanner) {
        System.out.print("Enter a non-negative integer: ");
        return scanner.nextInt();
    }

        public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case
        } else {
            return n * calculateFactorial(n - 1);  // Recursive case
        }
    }

    
    public static void displayResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = getInput(scanner);

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculateFactorial(number);
            displayResult(number, result);
        }

        scanner.close();
    }
}
