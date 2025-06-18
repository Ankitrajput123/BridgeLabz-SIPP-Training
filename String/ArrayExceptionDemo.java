import java.util.Scanner;

public class ArrayExceptionDemo {
    
    public static void handleException(String[] names) {
        System.out.println("=> Calling handleException()");
        try {
            
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Caught specific exception: " + aioobe);
        } catch (RuntimeException re) {
            System.out.println("Caught generic runtime exception: " + re);
        } finally {
            System.out.println("=> Finished handleException()");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

      


        
        handleException(names);

        sc.close();
    }
}
