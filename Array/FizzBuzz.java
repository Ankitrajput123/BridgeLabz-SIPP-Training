import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

     
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

     
        String[] results = new String[number];

     
        for (int i = 1; i <= number; i++) {
          
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
            }
            // For multiples of 3, store "Fizz"
            else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
            }
            // For multiples of 5, store "Buzz"
            else if (i % 5 == 0) {
                results[i - 1] = "Buzz";
            }
        
            else {
                results[i - 1] = String.valueOf(i);
            }
        }

        
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }

        
        scanner.close();
    }
}
