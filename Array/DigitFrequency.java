import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int[] frequency = new int[10];

        
        while (number != 0) {
            int digit = number % 10;  
            frequency[digit]++;       
            number = number / 10;     
        }

        
        System.out.println("Frequency of digits in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s).");
            }
        }

       
        scanner.close();
    }
}
