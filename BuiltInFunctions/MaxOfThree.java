import java.util.Scanner;

public class MaxOfThree {

        public static int getInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

       public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int num1 = getInput(scanner,"Enter 1st num");
        int num2 = getInput(scanner,"Enter 2nd num");
        int num3 = getInput(scanner,"Enter 3rd num");

        int max = findMaximum(num1, num2, num3);

        
        System.out.println("The maximum of the three numbers is: " + max);

        scanner.close();
    }
}
