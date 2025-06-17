import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

     
        int[] numbers = new int[5];

       
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

 
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            
            if (number > 0) {
              
                if (number % 2 == 0) {
                    System.out.println("Number " + number + " is positive and even.");
                } else {
                    System.out.println("Number " + number + " is positive and odd.");
                }
            } else if (number < 0) {
                
                System.out.println("Number " + number + " is negative.");
            } else {
                
                System.out.println("Number " + number + " is zero.");
            }
        }

       
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];

        if (firstElement == lastElement) {
            System.out.println("The first and last elements are equal.");
        } else if (firstElement > lastElement) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        
        scanner.close();
    }
}
