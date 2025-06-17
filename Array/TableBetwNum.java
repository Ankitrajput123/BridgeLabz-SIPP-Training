import java.util.Scanner;

public class TableBetwNum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int[][] multiplicationResult = new int[4][10];

      
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 10; j++) {
                multiplicationResult[i][j - 1] = (i + 6) * j;  // i + 6 gives numbers from 6 to 9
            }
        }

      
        for (int i = 0; i < 4; i++) {
            System.out.println("\nMultiplication Table for " + (i + 6) + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println((i + 6) + " * " + (j + 1) + " = " + multiplicationResult[i][j]);
            }
        }

       
        scanner.close();
    }
}
