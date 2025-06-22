import java.util.Scanner;

public class NumberCheck {

        public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive
        } else if (number < 0) {
            return -1; // Negative
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        int result = checkNumber(inputNumber);

        
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
