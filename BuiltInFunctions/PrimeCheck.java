import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime
        }

                for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not prime if divisible
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a number: ");
        int num = scanner.nextInt();

                if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }
}
