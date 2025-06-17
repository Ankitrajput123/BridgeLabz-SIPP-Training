import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

                int index = 0;

               while (number != 0) {
            // Extract the last digit of the number
            int digit = number % 10;
            digits[index] = digit;
            number = number / 10; // Remove the last digit
            index++;

                       if (index == maxDigit) {
                break;
            }
        }

               int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

                for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

               if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        }

               scanner.close();
    }
}
