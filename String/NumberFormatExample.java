import java.util.Scanner;

public class NumberFormatExample {

 
    public static void generateException() {
        String text = "abc123";      
        int number = Integer.parseInt(text); 
        System.out.println("Converted number: " + number); 
}
    
    public static void handleException() {
        String text = "xyz456"; 
        try {
            int number = Integer.parseInt(text); 
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
               handleException(); 
    }
}
