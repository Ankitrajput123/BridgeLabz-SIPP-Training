import java.util.Scanner;

public class YoungTallfriend {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

      
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height of " + friends[i] + " (in meters): ");
            heights[i] = scanner.nextDouble();
        }

        
        int youngestAge = ages[0];
        String youngestFriend = friends[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = friends[i];
            }
        }

        
        double tallestHeight = heights[0];
        String tallestFriend = friends[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = friends[i];
            }
        }

       
        System.out.println("\nThe youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " meters.");

     
        scanner.close();
    }
}
