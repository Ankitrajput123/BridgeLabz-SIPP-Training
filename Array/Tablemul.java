import java.util.Scanner;

public class Tablemul{
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        int[] table = new int[10];

        
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        
        for (int i = 0; i < table.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + number + " * " + (i + 1) + " = " + table[i]);
        }

        
        scanner.close();
    }
}
