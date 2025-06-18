import java.util.Arrays;
import java.util.Scanner;

public class CharArrayDemo {

    
    public static char[] userToCharArray(String input) {
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = input.charAt(i);
        }
        return result;
    }

   
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
    
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

      
        char[] builtinArray = text.toCharArray();

       
        char[] customArray = userToCharArray(text);
        boolean areEqual = compareCharArrays(builtinArray, customArray);

        
        System.out.println("Built-in toCharArray(): " + Arrays.toString(builtinArray));
        System.out.println("User-defined method:   " + Arrays.toString(customArray));
        System.out.println("Arrays are equal? " + areEqual);

        sc.close();
    }
}
