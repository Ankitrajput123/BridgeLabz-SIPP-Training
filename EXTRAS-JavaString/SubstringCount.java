import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

               System.out.print("Enter the substring to count: ");
        String subString = scanner.nextLine();

               int count = countSubstringOccurrences(mainString, subString);

               System.out.println("The substring \"" + subString + "\" appears " + count + " times.");
    }

        public static int countSubstringOccurrences(String main, String sub) {
        int count = 0;
        int index = 0;

                while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index++;  
        }

        return count;
    }
}
