import java.util.Scanner;

public class BubbleSortMarks {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Traverse the array multiple times
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap if needed
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no elements were swapped, the array is sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Input marks
        int[] marks = new int[n];
        System.out.println("Enter marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Sort marks using Bubble Sort
        bubbleSort(marks);

        // Output sorted marks
        System.out.println("Sorted marks in ascending order:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
