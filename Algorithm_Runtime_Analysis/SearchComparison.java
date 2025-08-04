import java.util.*;

public class SearchComparison {
    
    // Linear Search: O(N)
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target)
                return true;
        }
        return false;
    }

    // Binary Search: O(log N)
    public static boolean binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take dataset size
        System.out.print("Enter size of dataset (e.g. 1000, 10000, 1000000): ");
        int size = sc.nextInt();
        
        // Generate random dataset
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(size * 10); // values can repeat
        }

        // Choose a target randomly
        int target = data[rand.nextInt(size)];

        // Measure Linear Search
        long startLinear = System.nanoTime();
        boolean foundLinear = linearSearch(data, target);
        long endLinear = System.nanoTime();

        // Sort the array for Binary Search
        Arrays.sort(data); // O(N log N)

        // Measure Binary Search
        long startBinary = System.nanoTime();
        boolean foundBinary = binarySearch(data, target);
        long endBinary = System.nanoTime();

        // Output results
        System.out.println("\nTarget: " + target);
        System.out.println("Linear Search: " + (foundLinear ? "Found" : "Not Found")
                           + " | Time: " + (endLinear - startLinear)/1e6 + " ms");
        System.out.println("Binary Search: " + (foundBinary ? "Found" : "Not Found")
                           + " | Time (excluding sort): " + (endBinary - startBinary)/1e6 + " ms");
    }
}
