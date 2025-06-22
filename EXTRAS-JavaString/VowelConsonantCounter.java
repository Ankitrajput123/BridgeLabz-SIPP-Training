import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String text = input.nextLine();

                text = text.toLowerCase();

        int vowels = 0;
        int consonants = 0;

                for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        input.close();
    }
}
