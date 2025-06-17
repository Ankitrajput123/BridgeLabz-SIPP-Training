import java.util.Scanner;

public class ReverseNumb {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        int originalNumber = number;
        number = Math.abs(number);

      
        int count = (int) Math.log10(number) + 1; // The number of digits in the number

      
        int[] digits = new int[count];

        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }

        
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[i];
        }

       
        System.out.print("Reversed number: ");
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i]);
        }

       
        if (originalNumber < 0) {
            System.out.println(" (Negative number)");
        } else {
            System.out.println();
        }

        
        scanner.close();
    }
}
