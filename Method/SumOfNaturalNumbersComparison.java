import java.util.Scanner;

public class SumOfNaturalNumbersComparison {

    
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

        public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a natural number greater than 0.");
        } else {
            int recursiveSum = sumUsingRecursion(n);
            int formulaSum = sumUsingFormula(n);

                        System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);

                        if (recursiveSum == formulaSum) {
                System.out.println(" Both methods give the same result. The calculation is correct.");
            } else {
                System.out.println(" The results do not match. There may be an error in the computation.");
            }
        }

        scanner.close();
    }
}
