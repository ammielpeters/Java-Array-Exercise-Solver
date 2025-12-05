import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers separated by space:");
        
        // Fix for NoSuchElementException – use nextLine safely
        if (!sc.hasNextLine()) {
            System.out.println("No input provided!");
            return;
        }

        String input = sc.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Empty input!");
            return;
        }

        String[] parts = input.split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        // Sorting
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // Max & Min
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        // Sum & Average
        int sum = Arrays.stream(arr).sum();
        double avg = (double) sum / arr.length;

        // Output
        System.out.println("\n--- RESULTS ---");
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Sorted array:   " + Arrays.toString(sorted));
        System.out.println("Maximum value:  " + max);
        System.out.println("Minimum value:  " + min);
        System.out.println("Sum:            " + sum);
        System.out.println("Average:        " + avg);
    }
}
